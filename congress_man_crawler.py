from bs4 import BeautifulSoup
import requests
import json

html = requests.post('http://www.assembly.go.kr/assm/memact/congressman/memCond/memCondListAjax.do',
                     data={'currentPage': 1, 'rowPerPage': 299}).content

soup = BeautifulSoup(html, 'html.parser')

numbers = [a['src'][7:-4] for a in soup.findAll('img')]
cnt = 1
result = []
for number in numbers:
    html = requests.get('http://www.assembly.go.kr/assm/memPop/memPopup.do?dept_cd=' + number).content
    soup = BeautifulSoup(html, 'html.parser')
    
    keys = soup.findAll('dt')[1:]
    values = soup.findAll('dd')[1:]
    
    profile = {}
    profile['profile'] = [{key.text: value.text.replace('\t', '').replace('\r', '').replace('\n', '').replace(' ', '')} for key, value in zip(keys, values)]
    profile['name_kor'] = soup.findAll('h4')[0].text
    profile['name_eng'] = soup.findAll('li')[-3].text
    profile['image'] = soup.findAll('img', attrs={'alt': profile['name_kor']+' 의원사진'})[0].text
    result.append(profile)

    print(cnt)
    cnt += 1

with open('con_man.json', 'w') as f:
    f.write(json.dumps(result))
