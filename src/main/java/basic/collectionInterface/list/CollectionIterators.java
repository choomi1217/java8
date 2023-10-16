package basic.collectionInterface.list;

import java.util.*;

public class CollectionIterators {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "b", "c");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
