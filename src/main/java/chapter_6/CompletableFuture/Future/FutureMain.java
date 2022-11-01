package chapter_6.CompletableFuture.Future;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FutureMain {

    /*
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<String> future = new CompletableFuture<String>();
        future.complete("앵미");
        System.out.println(future.get());

        CompletableFuture<String> future = CompletableFuture.completedFuture("앵미");
        System.out.println(future.get());

        CompletableFuture<Void> future = CompletableFuture.runAsync(() -> {
            System.out.println("앵미");
        });

        future.get();


        ExecutorService executorService = Executors.newFixedThreadPool(4);

        CompletableFuture<Void> future = CompletableFuture.supplyAsync(() -> {
            System.out.println("Hello " + Thread.currentThread().getName());
            return "Hello";
        }, executorService).thenRunAsync(() -> {
            System.out.println(Thread.currentThread().getName());
        });

        future.get();

    }
    */
}
