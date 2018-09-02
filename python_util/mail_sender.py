import os
import smtplib

import argparse
from email.mime.text import MIMEText

email_address = os.getenv('politictalk_email_address')
email_password = os.getenv('politictalk_email_password')

smtp = smtplib.SMTP('smtp.gmail.com', 587)
smtp.starttls()
smtp.login('email_address', 'email_password')


def send(reciever, subject='test', message='test'):
    msg = MIMEText(message)
    msg['Subject'] = subject
    msg['To'] = reciever
    msg['From'] = email_address
    smtp.sendmail(email_address, reciever, msg.as_string())


if __name__ == '__main__':
    parser = argparse.ArgumentParser()
    parser.add_argument('reciever')
    parser.add_argument('subject')
    parser.add_argument('message')

    args = parser.parse_args()

    send(args.reciever, args.subject, args.message)