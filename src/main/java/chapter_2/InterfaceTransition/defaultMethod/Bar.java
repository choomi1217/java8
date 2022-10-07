package chapter_2.InterfaceTransition.defaultMethod;

import coomon.Foo;

public interface Bar {

    default void printNameUpperCase(){
        System.out.println("bar");
    }

}
