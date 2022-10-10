package chapter_3.Stream.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamBasicMain {
/*

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("a123");
        names.add("b123");
        names.add("c123");
        names.add("d123");

        // 중개 오퍼레이션
        names.stream().map(s -> {
            System.out.println(s);
            return s.toUpperCase();
        });

        System.out.println("-------------------");

        names.forEach(System.out::println);

        System.out.println("-------------------");

        // 종료 오퍼레이션
        List<String> collect = names.stream().map(s -> {
            System.out.println(s);
            return s.toUpperCase();
        }).collect(Collectors.toList());

        System.out.println("-------------------");

        collect.forEach(System.out::println);

        System.out.println("-------------------");

        // 번외. 스레드에 대해 설명 해줌
        List<String> threadCollect = names.parallelStream().map((s) -> {
            System.out.println(s + " | " + Thread.currentThread().getName());
            return s.toUpperCase();
        }).collect(Collectors.toList());

        System.out.println("-------------------");

        List<String> noneThreadCollect = names.stream().map((s) -> {
            System.out.println(s + " | " + Thread.currentThread().getName());
            return s.toUpperCase();
        }).collect(Collectors.toList());

    }
*/
}
