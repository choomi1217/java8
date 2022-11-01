# Future

```java
ExecutorService executorService = Executors.newSingleThreadExecutor();

Callable<String> hello = () -> {
    Thread.sleep(2000L);
    return "hello";
};

Future<String> submit = executorService.submit(hello);
System.out.println(" Started ");
submit.get();
System.out.println(" End ");
```

- `submit.get()`이 끝나기 전엔 아무것도 더 실행하지 않는 Blocking call 입니다.


> 스레드의 상태 확인

```java 
future.isDone()
```

> 스레드 캔슬
- 캔슬 후엔 get 할 수 없음
```java
future.cancel(true)
```

> Thread에 여러개 프로세스 넣기

- `submit(process)`는 하나의 프로세스만 스레드에 넣을 수 있지만
- `invokeAll()`은 프로세스를 List 형태로 넣을 수 있습니다.
- List로 넣은 3개의 프로세스가 전부 끝나야 스레드 종료입니다.
```java
List<Future<String>> futures = executorService.invokeAll(Arrays.asList(hello, java, oomi));
for ( Future f : futures) {
    System.out.println(f.get());
}
```

> 제일 먼저 끝난 프로세스 딱 하나
- 생각으로는 `oomi`가 1초이므로 제일 일찍 끝나서 oomi가 출력되어야 하는데 hello가 나왔습니다.
- singleThread이므로 가장 먼저 들어온 프로세스가 가장 먼저 끝난것
- Thread를 3개까지 늘려서 테스트해보니 oomi가 먼저 끝납니다.
```java
String invokeAny = executorService.invokeAny(Arrays.asList(hello, java, oomi));
System.out.println(invokeAny);
```

```text
hello
```

```java
ExecutorService executorService = Executors.newFixedThreadPool(3);
```
