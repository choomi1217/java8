package chapter_2.InterfaceTransition.defaultMethod.defaultMethod;

public interface Bar {

    default void printNameUpperCase(){
        System.out.println("bar");
    }

}
