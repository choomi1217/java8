package basic.collectionInterface.set;

import java.util.HashSet;

public class CollectionSet {
    public static void main(String[] args) {
        HashSet<Person> set = new HashSet<>();
        set.add(new Person(15, "son"));
    }
}

class Person{
    private int age;
    private String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }
}
