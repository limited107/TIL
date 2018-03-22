# 최근 수행한 명령의 exit code 보기 
```shell
# cal 명령을 실행 
$ cal

# 직전 입력 명령(cal)에 대한 exit code 출력 
$ echo $?
```

# mysql의 startup 기다리기 
```shell
#!/bin/bash

echo "Waiting for mysql"
until mysql -h"$MYSQL_HOST" -P"$MYSQL_PORT" -u"$MYSQL_USER" -p"$MYSQL_PASSWORD" -e '\q'
do
  printf "."
  sleep 1
done

echo -e "\nmysql ready"
```

# 리눅스 특수 문자 정리
http://jdm.kr/blog/4

## 표준 출력 
1. 표준 출력 new (>)
```shell
ls > text.txt
```

2. 표준 출력 append (>>)
