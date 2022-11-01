# Executor

Thread를 직접 다루는 것이 아니고 Executor를 통해서 사용합니다.

```java
public class ExecutorMain {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread : " + Thread.currentThread().getName());
            }
        });
    }

}
```

> 시간대를 두고 스레드 실행
```java 
ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
executorService.schedule(getRun("hi"),3, TimeUnit.SECONDS);

executorService.scheduleAtFixedRate(getRun("hi"),3,1, TimeUnit.SECONDS);
```

> Runnable
```java
public static Runnable getRun(String s){
    return () -> System.out.println(s + Thread.currentThread().getName());
}
```

Runnable 로 만든 스레드는 값을 반환 해주지 않으므로 Callable 사용.
Callable이 반환 해주는 값을 받는 것이 Future
