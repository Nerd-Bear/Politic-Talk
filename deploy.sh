kill $(ps -ef |grep 'spring' | awk '{print $2}')
git pull
gradle build
gradle bootRun &