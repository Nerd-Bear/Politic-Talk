import json
import os
from pymongo import MongoClient

client = MongoClient()
db = client['politic-talk']
data_files = os.listdir('politic_man_data')

collections = [None, None, '국회의원', '시도지사', '구시군의장', '시도의원',
               '구시군의원', None, '광역의원비례대표', '기초의원비례대표', '교육의원', '교육감']

for file_name in data_files:
    with open('politic_man_data/' + file_name, 'r', encoding='UTF-8') as f:
        print(file_name)

        num = int(file_name[9]) if file_name[9] != '1' else int(file_name[9:11])
        collection = db['politician']
        data = json.loads(f.read())
        for a in data:
            a['position'] = collections[num]
            a['_id'] = 'a' + collection['_id']
        collection.insert_many(data)
