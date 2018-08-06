# Object.equals()
Object 클래스의 equals()는 ==과 동일한 결과를 리턴한다.
String 클래스는 equals()를 오버라이딩하고 있기 때문에 문자열 값이 동일한지 비교한다.
논리적으로 동등한 객체인지 비교하기 위해 equals()를 사용하고자 하면, 이를 반드시 오버라이딩해야한다. 

# 문자열에 포함된 escape character을 진짜로 바꾸기
```java
//문자열에 있는 \n, \t를 실제 escape chracter로 바꿔준다
String r1 = response.replace("\\n", "\n").replace("\\t", "\t");
```
