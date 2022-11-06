package chapter_7.etc.ArraySort;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class ArraysParallelSort {

    public static void main(String[] args) {

        int size = 1500;
        int[] numbers = new int[size];
        Random random = new Random();
        IntStream.range(0,size).forEach(value -> numbers[value] = random.nextInt());

        long start = System.nanoTime();
        Arrays.sort(numbers);
        System.out.println("serial sorting took " + (System.nanoTime() - start));

        IntStream.range(0,size).forEach(value -> numbers[value] = random.nextInt());
        start = System.nanoTime();
        Arrays.parallelSort(numbers);
        System.out.println("parellel sorting took " + (System.nanoTime() - start));

    }

}