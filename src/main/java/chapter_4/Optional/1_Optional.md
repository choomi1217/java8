# Optional

Null을 리턴하거나 Null체크를 깜빡하는 경우 NPE가 발생

이러한 상황에서 선택할 수 있는 방법
1. 예외를 던진다. ( 스택트레이스 때문에 비싸다. )
2. null을 리턴한다. ( 사용자가 조심해서 써야한다. )
3. Optional을 리턴한다. 👍

아래 같은 코드는 null처리 때문에 신경써야 할 것이 많습니다.
```java
    List<OnlineClass> springClass = new ArrayList<>();
        springClass.add(new OnlineClass(1, "spring boot - 1" , true));
        springClass.add(new OnlineClass(2, "spring boot - 2" , true));
        springClass.add(new OnlineClass(3, "spring boot - 3" , false));
        springClass.add(new OnlineClass(4, "spring boot - 4" , false));
        springClass.add(new OnlineClass(5, "spring boot - 5" , false));

        OnlineClass springBoot = new OnlineClass(1, "spring boot", false);
        Progress progress = springBoot.getProgress();
        if(progress!=null){
            System.out.println(progress);
        }
```

```java
public Optional<Progress> getProgress() {
    return Optional.ofNullable(progress);
}
```


아래와 같이 옵셔널을 매개변수로 사용하는건 권장하지 않습니다
```java
public void setProgress(Optional<Progress> progress) {
    if(progress != null){
        progress.ifPresent(p -> this.progress = p);
    }
}
```


