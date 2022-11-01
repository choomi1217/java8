# CompletableFuture

java3 이전 Future의 문제
1. 예외처리 API를 제공하지 않습니다.
2. get()이 블로킹이다.
3. get이 블로킹이므로 get 호출 전에 callback을 줄 수 없다.

CompletableFuture는 외부에서 강제적으로 Complete 할 수 있음.

```java
CompletableFuture<String> future = new CompletableFuture<String>();
future.complete("앵미");
System.out.println(future.get());
```

```java
CompletableFuture<String> future = CompletableFuture.completedFuture("앵미");
System.out.println(future.get());
```

> 반환값이 있는 작업 (supplyAsync)

```java
CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
    System.out.println("앵미");
    return "Hello";
});

System.out.println(future.get());
```

> 반환값이 없는 작업 (runAsync)

```java
CompletableFuture<Void> future = CompletableFuture.runAsync(() -> {
    System.out.println("앵미");
});

future.get();
```

> callback을 하는 방법 (.thenApply())

- 반환 값이 있는 콜백 (thenApply)
```java
CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
    System.out.println("Hello " + Thread.currentThread().getName());
    return "Hello";
}).thenApply((s) -> {
    System.out.println(Thread.currentThread().getName());
    return s.toUpperCase();
});

System.out.println(future.get());
```

- 반환 값이 없는 콜백 (thenAccept)
```java
CompletableFuture<Void> future = CompletableFuture.supplyAsync(() -> {
    System.out.println("Hello " + Thread.currentThread().getName());
    return "Hello";
}).thenAccept((s) -> {
    System.out.println(Thread.currentThread().getName());
    System.out.println(s.toUpperCase());
});

future.get();
```

- 반환 값도 없고 파라미터도 필요 없다 (thenRun)
```java
CompletableFuture<Void> future = CompletableFuture.supplyAsync(() -> {
    System.out.println("Hello " + Thread.currentThread().getName());
    return "Hello";
}).thenRun(() -> {
    System.out.println(Thread.currentThread().getName());
});

future.get();
```

### ForkJoinPool
Thread가 현재 실행중인 프로세스가 없으면 직접 Dequeue에서 프로세스를 가져와서 작업을 하는 방식의 프레임워크

이것 덕분에 `Executor`를 사용하지 않고도 Thread를 편리하게 사용할 수 있음.

직접 `Excutor`를 만들어서 사용해도 됨.
Thread 이름이 조금 달라지게 됨. (ForkJoinPool > pool-1)
```java

ExecutorService executorService = Executors.newFixedThreadPool(4);

CompletableFuture<Void> future = CompletableFuture.supplyAsync(() -> {
    System.out.println("Hello " + Thread.currentThread().getName());
    return "Hello";
}, executorService).thenRun(() -> {
    System.out.println(Thread.currentThread().getName());
});
```

```text
Hello ForkJoinPool.commonPool-worker-3
main

---

Hello pool-1-thread-1
pool-1-thread-1
```

또한 Callback 이후로 Thread를 변경하고 싶다면 아래 callback 메소드들 사용.
```java
thenRunAsync()
thenApplyAsync()
thenAcceptAsync()
```

```java
ExecutorService executorService = Executors.newFixedThreadPool(4);

CompletableFuture<Void> future = CompletableFuture.supplyAsync(() -> {
    System.out.println("Hello " + Thread.currentThread().getName());
    return "Hello";
}, executorService).thenRunAsync(() -> {
    System.out.println(Thread.currentThread().getName());
});

future.get();
```