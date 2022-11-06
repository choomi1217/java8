# CompletableFuture 응용

예전엔 callback이 어려워서 아래와 같이 비동기를 두개를 연결하려면 실행하고 기다리는 형태였습니다.
```java
CompletableFuture<String> hello = CompletableFuture.supplyAsync(() -> {
    System.out.println("Hello" + Thread.currentThread().getName());
    return "Hello";
});

CompletableFuture<String> world = CompletableFuture.supplyAsync(() -> {
    System.out.println("World" + Thread.currentThread().getName());
    return "World";
});

hello.get();
world.get();
```

## Java8 이후엔 아래처럼 Thread 2개를 연결 할 수 있게 됐습니다.
> "Hello"를 받는 World, 즉 서로 연간 관계가 있을 경우엔 아래처럼
### thenCompose
```java
public class FutureMainSecond {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<String> hello = CompletableFuture.supplyAsync(() -> {
            System.out.println("Hello" + Thread.currentThread().getName());
            return "Hello";
        });
        CompletableFuture<String> future = hello.thenCompose(FutureMainSecond::getWorld);
        System.out.println(future.get());
    }

    private static CompletableFuture<String> getWorld(String message) {
        return CompletableFuture.supplyAsync(() -> {
            System.out.println("World" + Thread.currentThread().getName());
            return message + " World";
        });
    }

}
```

> 서로 연관은 없지만 비동기적으로 2가지를 실행을 해야 할 땐
### Combine
```java
public class FutureMainSecond {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<String> hello = CompletableFuture.supplyAsync(() -> {
            System.out.println("Hello" + Thread.currentThread().getName());
            return "Hello";
        });

        CompletableFuture<String> world = CompletableFuture.supplyAsync(() -> {
            System.out.println("World" + Thread.currentThread().getName());
            return "World";
        });

        CompletableFuture<String> future = hello.thenCombine(world, (h, w) -> h + " " + w );

        System.out.println(future.get());

    }

}
```

> 서로 연관은 없지만 비동기적으로 많은걸 실행 해야 할 땐
### allOf
- 모든 Future들의 결과 타입이 동일하다는 보장이 없다.
- 그중에 어떤 것은 에러가 날 수도 있다.
- **_위 두가지 이유로 인해 결과가 무의미함 (null이 반환 됨)_**
```java
CompletableFuture<String> hello = CompletableFuture.supplyAsync(() -> {
    System.out.println("Hello" + Thread.currentThread().getName());
    return "Hello";
    });

    CompletableFuture<String> world = CompletableFuture.supplyAsync(() -> {
    System.out.println("World" + Thread.currentThread().getName());
    return "World";
    });

    CompletableFuture<Void> future = CompletableFuture.allOf(hello, world)
    .thenAccept(System.out::println);

    System.out.println(future.get());
```

```text
WorldForkJoinPool.commonPool-worker-5
HelloForkJoinPool.commonPool-worker-3
null
null
```

> null이 아니고 제대로 된 반환값을 받고 싶다면... 번거롭지만 Collection을 거쳐야 한다.

```java
public class FutureMainSecond {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<String> hello = CompletableFuture.supplyAsync(() -> {
            System.out.println("Hello" + Thread.currentThread().getName());
            return "Hello";
        });

        CompletableFuture<String> world = CompletableFuture.supplyAsync(() -> {
            System.out.println("World" + Thread.currentThread().getName());
            return "World";
        });

        List<CompletableFuture> futures = Arrays.asList(hello, world);
        CompletableFuture[] futuresArray = futures.toArray(
            new CompletableFuture[futures.size()]);

        CompletableFuture<List<Object>> result = CompletableFuture.allOf(futuresArray)
            .thenApply(v -> futures.stream()
                .map(CompletableFuture::join)
                .collect(Collectors.toList()));

        result.get().forEach(System.out::println);
    }
}
```
##### 반환 타입이 어떤건지 몰라서 Object로 나오지만 현재는 String으로 바꿔도 무관합니다.

> 아무거나 하나 빨리 끝나는 것
### anyOf
```java
CompletableFuture<Void> future = CompletableFuture.anyOf(hello, world).thenAccept(System.out::println);
future.get();
```

## CompletableFuture의 예외처리

> exceptionally
> 
```java
boolean throwError = true;

CompletableFuture<String> hello = CompletableFuture.supplyAsync(() -> {
    if(throwError){
        throw  new IllegalArgumentException();
    }
    System.out.println("Hello" + Thread.currentThread().getName());
    return "Hello";
}).exceptionally(ex -> {
    System.out.println(ex);
    return "Error!";
});

System.out.println(hello.get());
```
```text
java.util.concurrent.CompletionException: java.lang.IllegalArgumentException
Error!
```

> handle

```java
boolean throwError = true;

CompletableFuture<String> hello = CompletableFuture.supplyAsync(() -> {
    if(throwError){
        throw  new IllegalArgumentException();
    }
    System.out.println("Hello" + Thread.currentThread().getName());
    return "Hello";
}).handle((result, ex) -> {
    if(ex != null){
        System.out.println(ex);
        return "Error";
    }
    return result;
});

System.out.println(hello.get());
```
```text
java.util.concurrent.CompletionException: java.lang.IllegalArgumentException
Error
```