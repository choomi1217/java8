package basic.collectionInterface.list;

import java.util.*;

public class CollectionList {
    public static void main(String[] args) {
        array();
        linkedList();
        stackQueue();
        iterator();

    }

    private static void iterator() {
        List<String> list = Arrays.asList("a", "b", "c");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    private static void stackQueue() {
        Stack<String> stack = new Stack<>();
        Queue<String> queue = new LinkedList<>();
        queue.offer("a");
        queue.add("b");
    }

    private static void linkedList() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("a");
        linkedList.add("b");
        linkedList.add("c");

        linkedList.forEach(System.out::print); // abc
        linkedList.add("d");
        linkedList.forEach(System.out::print); // abcd

        linkedList.getFirst();

    }

    private static void array() {
        ArrayList<String> arr1 = new ArrayList<>();
        arr1.add("a");
        arr1.add("c");
        arr1.add("d");

        arr1.forEach(System.out::print); // acd
        space();

        arr1.set(2,"b");
        arr1.forEach(System.out::print); //acb
        space();

        ArrayList<String> arr2 = new ArrayList<>(arr1);
        arr2.forEach(System.out::print); //acb
        space();

        arr2.sort(String::compareTo);
        arr2.forEach(System.out::print); //abc
        space();
    }

    public static void space(){
        System.out.println("\n");
    }
}
