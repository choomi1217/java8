package basic.string_class;

public class StringClass {
    public static void main(String[] args) {
        String hello1 = "Hello World";
        String hello2 = "Hello World";
        String hi1 = new String("Hi World");
        String hi2 = new String("Hi World");
        System.out.println(hello1 == hello2);
        System.out.println(hi1 == hi2);
    }
}
