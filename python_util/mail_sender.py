import os
import smtplib

import argparse
from email.mime.text import MIMEText

EMAIL_ADDRESS = os.getenv('POLITICTALK_EMAIL_ADDRESS')
EMAIL_PASSWORD = os.getenv('POLITICTALK_EMAIL_PASSWORD')

smtp = smtplib.SMTP('smtp.gmail.com', 587)
smtp.starttls()
smtp.login(EMAIL_ADDRESS, EMAIL_PASSWORD)


def send(receiver, subject='test', message='test'):
    msg = MIMEText(message)
    msg['Subject'] = subject
    msg['To'] = receiver
    msg['From'] = EMAIL_ADDRESS
    smtp.sendmail(EMAIL_ADDRESS, receiver, msg.as_string())


if __name__ == '__main__':
    parser = argparse.ArgumentParser()
    parser.add_argument('receiver')
    parser.add_argument('subject')
    parser.add_argument('message')

    args = parser.parse_args()

    send(args.receiver, args.subject, args.message)