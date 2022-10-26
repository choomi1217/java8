# Concurrent Programming

### Concurrent
- 동시에 여러 작업을 할 수 있는 소프트 웨어


> 스레드를 만드는 방법

1. `Thread`를 상속 받는다. 
```java
public class ConcurrentMain {

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();

        System.out.println("Hello! ");
    }

    static class MyThread extends Thread{
        @Override
        public void run() {
            System.out.println("My Thread : " + Thread.currentThread().getName());
        }
    }
}
```

> 순서대로 코드를 적어도 실행 순서는 보장하지 않습니다.

```text
Hello! 
My Thread : Thread-0
```

2. 람다로
```java
public class ConcurrentMain {

    public static void main(String[] args) {
        Thread thread = new Thread(()-> System.out.println("Thread: " + Thread.currentThread().getName()));
        thread.run();

        System.out.println("Hello : " + Thread.currentThread().getName());
    }
}
```

````text
Thread: main
Hello : main
````


> 스레드 재우기

```java
public static void main(String[] args) {
    Thread thread = new Thread(()-> {
        try {
            Thread.sleep(1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Thread: " + Thread.currentThread().getName());
    });
    thread.start();

    System.out.println("Hello : " + Thread.currentThread().getName());
}
```

```text
Hello : main
Thread: Thread-0
```

> 스레드 깨우기

```java
public static void main(String[] args) {
    Thread thread = new Thread(()-> {
        while (true){
            System.out.println("Thread : " + Thread.currentThread().getName());
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException e) {
                System.out.println("exit!");
                return;
            }
        }
    });
    thread.start();

    System.out.println("Hello : " + Thread.currentThread().getName());
    try {
        Thread.sleep(3000L);
    } catch (InterruptedException e) {
        throw new RuntimeException(e);
    }
    thread.interrupt();
}
```

```text
Hello : main
Thread : Thread-0
Thread : Thread-0
Thread : Thread-0
exit!
```

> 스레드 기다리기
```java
public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(()-> {
            System.out.println("Thread : " + Thread.currentThread().getName());
            try {
                Thread.sleep(3000L);
            } catch (InterruptedException e) {
                throw new IllegalArgumentException(e);
            }
        });
        thread.start();

        System.out.println("Hello : " + Thread.currentThread().getName());
        thread.join();
        System.out.println(thread + "is finished");
    }
```

```text
Hello : main
Thread : Thread-0
Thread[Thread-0,5,]is finished
```