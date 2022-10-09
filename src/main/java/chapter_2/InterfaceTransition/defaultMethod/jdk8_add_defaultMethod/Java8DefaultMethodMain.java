package chapter_2.InterfaceTransition.defaultMethod.jdk8_add_defaultMethod;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.Spliterator;
import java.util.stream.Collectors;

public class Java8DefaultMethodMain {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("a123");
        names.add("b123");
        names.add("c123");
        names.add("d123");

        /*
        names.forEach(System.out::println);
        */

        /*
        Spliterator<String> spliterator = names.spliterator();
        Spliterator<String> trySplit = spliterator.trySplit();
        while (spliterator.tryAdvance(System.out::println));
        System.out.println("----------------------------");
        while (trySplit.tryAdvance(System.out::println));
        */

        /* stream count */
        long count = names.stream().map(String::toUpperCase)
            .filter(s -> s.startsWith("A"))
            .count();
        System.out.println(" count : " + count);

        /* stream to set */
        Set<String> set = names.stream().map(String::toUpperCase)
            .filter(s -> s.startsWith("A"))
            .collect(Collectors.toSet());
        System.out.println(" set : " + set);

        /* collection removeIf */
        names.removeIf(s -> s.startsWith("a"));
        names.forEach(System.out::println);

        /* compare */
        Comparator<String> compareToIgnoreCase = String::compareToIgnoreCase;
        names.sort(compareToIgnoreCase.reversed());
        names.forEach(System.out::println);

    }

}
