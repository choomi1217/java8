# Optional API

옵셔널을 실제로 활용 해보자면 아래와 같이 해당 객체가 있을지 없을지 모를때 활용 할 수 있습니다!
```java
Optional<OnlineClass> spring = springClass.stream()
    .filter(onlineClass -> onlineClass.getTitle().startsWith("spring"))
    .findFirst();

boolean present = spring.isPresent();
```