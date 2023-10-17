package interview;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashtableSynchronizationExample {
    public static void main(String[] args) {
        final int NUM_THREADS = 3;
        final int NUM_ITERATIONS = 1000;

        // Hashtable은 동기화됨
        Hashtable<Integer, Integer> synchronizedTable = new Hashtable<>();

        // HashMap은 동기화되지 않음
        HashMap<Integer, Integer> nonSynchronizedMap = new HashMap<>();

        Runnable synchronizedRunnable = () -> {
            for (int i = 0; i < NUM_ITERATIONS; i++) {
                synchronizedTable.put(i, i);
            }
        };

        Runnable nonSynchronizedRunnable = () -> {
            for (int i = 0; i < NUM_ITERATIONS; i++) {
                nonSynchronizedMap.put(i, i);
            }
        };

        Thread[] synchronizedThreads = new Thread[NUM_THREADS];
        Thread[] nonSynchronizedThreads = new Thread[NUM_THREADS];

        for (int i = 0; i < NUM_THREADS; i++) {
            synchronizedThreads[i] = new Thread(synchronizedRunnable);
            nonSynchronizedThreads[i] = new Thread(nonSynchronizedRunnable);
            synchronizedThreads[i].start();
            nonSynchronizedThreads[i].start();
        }

        try {
            for (int i = 0; i < NUM_THREADS; i++) {
                synchronizedThreads[i].join();
                nonSynchronizedThreads[i].join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Hashtable size: " + synchronizedTable.size());
        System.out.println("HashMap size: " + nonSynchronizedMap.size());

    }

}
