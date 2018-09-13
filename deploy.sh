kill $(ps -ef |grep 'spring' | awk '{print $2}')
cd /home/ubuntu/Politic-Talk
git pull
gradle build
gradle bootRun