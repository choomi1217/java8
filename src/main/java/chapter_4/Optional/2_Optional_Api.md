# Optional API

> 옵셔널을 실제로 활용 해보자면 아래와 같이 해당 객체가 있을지 없을지 모를때 활용 할 수 있습니다
```java
Optional<OnlineClass> spring = springClass.stream()
    .filter(onlineClass -> onlineClass.getTitle().startsWith("spring"))
    .findFirst();

boolean present = spring.isPresent();
```

> 옵셔널에서 값을 꺼내오는 방법 
```java
Optional<OnlineClass> spring = springClass.stream()
    .filter(onlineClass -> onlineClass.getTitle().startsWith("spring"))
    .findFirst();

OnlineClass onlineClass = spring.get();
```
있으면 에러가 안 나지만 없으면 `No such element exception`이 발생합니다.

> 옵셔널에 값이 있으면 함수형 인터페이스 실행
```java
optional.ifPresent(onlineClass -> System.out.println(onlineClass.getTitle()));
```

> 옵셔널에 값이 있으면 메소드 실행
```java
OnlineClass bClass = optional.orElse(createNewClass());
```

> 옵셔널에 값이 없으면 만들어서 반환
```java
OnlineClass cClass = optional.orElseGet(OptionalMain::createNewClass);
```

> 없으면 에러 발생
```java
optional.orElseThrow(IllegalStateException::new);
```

> Optional<T> 맵으로 꺼내는 방법
```java
Optional<String> optionalTitle = optional.map(OnlineClass::getTitle);
System.out.println(optionalTitle.isPresent());
```
아래처럼 게터가 옵셔널 반환시 한겹 더 벗겨야 함, 혹은 `flatMap` 사용
```java
Optional<Optional<Progress>> optionalProgress = optional.map(OnlineClass::getProgress);
Optional<Progress> progress1 = optional.map(OnlineClass::getProgress).orElseThrow();
Optional<Progress> progress2 = optional.flatMap(OnlineClass::getProgress);

```













