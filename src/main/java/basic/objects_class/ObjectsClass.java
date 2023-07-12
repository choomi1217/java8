package basic.objects_class;

import java.util.Objects;

public class ObjectsClass {
    public static void main(String[] args) {
        Integer a = 10;
        Integer b = 10;
        if (a!=null){
            System.out.println(a.equals(b));
        }
        System.out.println(Objects.equals(a, b));
    }
}
