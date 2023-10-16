package basic.generics;

import java.util.ArrayList;

public class JavaGenerics {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add("a");

        try {
            Integer o = (Integer) arrayList.get(2);
        }catch (ClassCastException e){
            System.out.println("ClassCastException");
        }

        ArrayList<Integer> arrayList2 = new ArrayList<>();
        arrayList2.add(1);
        arrayList2.add(2);
        // arrayList2.add("a"); // compile error
    }
}
