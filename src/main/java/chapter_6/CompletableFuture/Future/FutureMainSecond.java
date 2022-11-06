package chapter_6.CompletableFuture.Future;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;

public class FutureMainSecond {
/*
    public static void main(String[] args) throws ExecutionException, InterruptedException {

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

    }*/
}
