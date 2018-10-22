# Object.equals()
Object 클래스의 equals()는 ==과 동일한 결과를 리턴한다.
String 클래스는 equals()를 오버라이딩하고 있기 때문에 문자열 값이 동일한지 비교한다.
논리적으로 동등한 객체인지 비교하기 위해 equals()를 사용하고자 하면, 이를 반드시 오버라이딩해야한다. 

# 문자열에 포함된 escape character을 진짜로 바꾸기
```java
//문자열에 있는 \n, \t를 실제 escape chracter로 바꿔준다
String r1 = response.replace("\\n", "\n").replace("\\t", "\t");
```
# Deep copy
1. https://stackoverflow.com/questions/2156120/java-recommended-solution-for-deep-cloning-copying-an-instance
2. https://www.baeldung.com/java-deep-copy
3. Cloner util을 사용할 수 있음 
- https://mvnrepository.com/artifact/uk.com.robust-it/cloning

# Lazy Copy(Lazy Loading 느낌!)

# Try Catch
* try with resources 리소스가 자동으로 해제된다.

# Stream 
* GroupingBy 묶을 수 있다.
* Partitioning은 최대 2개의 그룹으로 분류할 수 있다.
                                                                                                                                                                               
# Functional Interface
* Runnable : 기존부터 존재하던 인터페이스로 스레드를 생성할때 주로사용하였으며 가장 기본적인 함수형 인터페이스다. void 타입의 인자없는 메서드를 갖고있다.
```java
Runnable r = () -> System.out.println("hello functional");
r.run();
```

* Supplier<T> : 인자는 받지않으며 리턴타입만 존재하는 메서드를 갖고있다. 순수함수에서 결과를 바꾸는건 오직 인풋(input) 뿐이다. 그런데 인풋이 없다는건 내부에서 랜덤함수같은것을 쓰는게 아닌이상 항상 같은 것을 리턴하는 메서드라는걸 알 수 있다.
```java
Supplier<String> s = () -> "hello supplier";
String result = s.get();
```

* Consumer<T> : 리턴을 하지않고(void), 인자를 받는 메서드를 갖고있다. 인자를 받아 소모한다는 뜻으로 인터페이스 명칭을 이해하면 될듯 하다.
```java
Consumer<String> c = str -> System.out.println(str);
c.accept("hello consumer");
```

* Function<T, R> : 인터페이스 명칭에서부터 알 수 있듯이 전형적인 함수를 지원한다고 보면 된다. 하나의 인자와 리턴타입을 가지며 그걸 제네릭으로 지정해줄수있다. 그래서 타입파라미터(Type Parameter)가 2개다.
```java
Function<String, Integer> f = str -> Integer.parseInt(str);
Integer result = f.apply("1");
```

* Predicate<T> : 하나의 인자와 리턴타입을 가진다. Function과 비슷해보이지만 리턴타입을 지정하는 타입파라미터가 안보인다. 반환타입은 boolean 타입으로 고정되어있다. Function<T, Boolean>형태라고 보면된다.
```java
Predicate<String> p = str -> str.isEmpty();
boolean result = p.test("hello");
```

출처: http://multifrontgarden.tistory.com/125 [우리집앞마당]
