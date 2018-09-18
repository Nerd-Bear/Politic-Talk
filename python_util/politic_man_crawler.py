from bs4 import BeautifulSoup
from selenium import webdriver
import time
import json
from bson.objectid import ObjectId

key_dict = {'정당명': 'party',
            '성별': 'sex',
            '주소': 'address',
            '직업': 'job',
            '학력': 'education',
            '득표수(득표율)': 'votes',
            '추천순위': 'recommend'}


def crawl(num, city_name='none'):
    driver.find_element_by_xpath('//*[@id="spanSubmit"]/input').click()
    time.sleep(3)
    driver.implicitly_wait(5)

    result = []
    soup = BeautifulSoup(driver.page_source, 'html.parser')

    trs = soup.find_all('tr')
    keys = [a.text for a in trs[0].find_all('th')]
    for tr in trs[1:]:
        tds = tr.find_all('td')
        temp = dict()
        temp['region'] = city_name

        for key, td in zip(keys, tds):
            if key == '사진':
                temp['photo'] = 'http://info.nec.go.kr' + td.find('input')['src']
            elif key == '성명(한자)':
                temp['name'] = td.text.split('(')[0].replace('\t', '').replace('\n', '')
            elif key == '생년월일(연령)':
                temp['birthDay'] = td.text.split('(')[0].replace('\t', '').replace('\n', '')
            elif key == '경력':
                temp['career'] = td.text.replace('(', '\n(').split('\n')[1:]
            elif key == '선거구명':
                if temp['region'] != td.text:
                    temp['region'] += ' ' + td.text
            elif key in ['시도명', '구시군명']:
                pass
            else:
                temp[key_dict[key]] = td.text

        temp['region1'] = city_name
        temp['_id'] = str(ObjectId())
        result.append(temp)
    with open('politic_man_data\\info_nec_{}_{}'.format(num, city_name), 'w', encoding='UTF-8') as f:
        f.write(json.dumps(result))


driver = webdriver.Chrome('C:\\Users\\dsm2017\\Desktop\\source\\chromedriver.exe')

driver.implicitly_wait(5)
driver.get('http://info.nec.go.kr/main/showDocument.xhtml?electionId=0020180613&topMenuId=EP&secondMenuId=EPEI01')

for i in range(2, 12):
    print(i)
    print()

    if i == 7:
        continue
    driver.execute_script('setElectionCode({0});'.format(i))

    if i not in [3, 11]:
        time.sleep(3)
        driver.implicitly_wait(5)
        select_city = driver.find_element_by_id('cityCode')
        city_cnt = len(select_city.find_elements_by_tag_name('option'))
        for cnt in range(1, city_cnt):
            select_city = driver.find_element_by_id('cityCode')
            city = select_city.find_elements_by_tag_name('option')[cnt]
            print(city.text)
            select_city.click()
            city.click()
            driver.implicitly_wait(3)
            crawl(i, city.text)
    else:
        crawl(i)
