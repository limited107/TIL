# 최근 수행한 명령의 exit code 보기 
```shell
# cal 명령을 실행 
$ cal

# 직전 입력 명령(cal)에 대한 exit code 출력 
$ echo $?
```

# 리눅스 특수 문자 정리
http://jdm.kr/blog/4

## 표준 출력 
1. 표준 출력 new (>)
```shell
ls > text.txt
```

2. 표준 출력 append (>>)

# shell에서 vi 키맵 사용
```shell
set -o vi
```

# grep
```shell
-o : matching only
-E : extended regex (+ operator 적용됨)
-P : perl regex 적용 

grep -E -o 'userId : [0-9]+'
```

* -P 옵션을 적용하면 lookbehind regex를 적용할 수 있음.
* https://superuser.com/a/596499
* https://www.regular-expressions.info/lookaround.html

```bash
grep -o -h -P '(?<=orderIds"):.*\]' webapp.log
```

'orderIds:'에 뒤따르고 .*] 에 매칭되는 문자열에 대한 결과만 출력됨 
