package chapter_2.InterfaceTransition.defaultMethod;

import coomon.Foo;

public class DefaultMethodMain {

    public static void main(String[] args) {

        Foo foo = new DefaultFoo("oo");
        foo.printName();
        foo.printNameUpperCase();
    }

}