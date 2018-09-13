from flask import Flask
import os

app = Flask(__name__)


@app.route('/hook', methods=['POST'])
def hook():
    os.system('. deploy.sh')
    return '', 200


if __name__ == '__main__':
    app.run('0.0.0.0')
