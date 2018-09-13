cd /home/ubuntu/Politic-Talk-Backend
git pull
gradle build
kill $(ps -ef |grep 'spring' | awk '{print $2}') && gradle bootRun