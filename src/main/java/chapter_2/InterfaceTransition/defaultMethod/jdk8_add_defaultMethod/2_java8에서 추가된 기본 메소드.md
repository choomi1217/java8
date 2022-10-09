# 자바 8에서 추가된 기본 메소드

1. Iterable
```java
List<String> names = new ArrayList<>();
names.add("a");
names.add("b");
names.add("c");
names.add("d");
```

- foreach
```java
names.forEach(System.out::println);
```

2. Collection
```java
long count = names.stream().map(String::toUpperCase)
            .filter(s -> s.startsWith("A"))
            .count();

System.out.println(count);
```
3. Comparator
```java

```


### Abstract Class

Java8 이전의 인터페이스는 어댑터 클래스를 가운데에 두고 클래스 a는 a 메소드만 구현 할 수 있게끔, 클래스 b는 b 메소드만 구현 할 수 있게끔 했으나
Java8 이후엔 default 메소드를 통해 어댑터 없이 원하는 메소드만 구현 할 수 있습니다.

![adapter-diagram](http://www.plantuml.com/plantuml/proxy?src=https://github.com/choomi1217/java8/blob/master/src/main/java/chapter_2/InterfaceTransition/defaultMethod/adapter.puml)




