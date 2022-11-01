package chapter_6.CompletableFuture.Executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ExecutorMain {
/*
    public static void main(String[] args) {
        ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();

        //executorService.schedule(getRun("hi"),3, TimeUnit.SECONDS);

        executorService.scheduleAtFixedRate(getRun("hi"),3,1, TimeUnit.SECONDS);

    }
*/
    public static Runnable getRun(String s){
        return () -> System.out.println(s + Thread.currentThread().getName());
    }

}
