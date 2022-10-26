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