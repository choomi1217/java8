package chapter_2.InterfaceTransition.defaultMethod.defaultMethod;

import common.Foo;

public class DefaultFoo implements Foo, Bar {

    String name;

    DefaultFoo(String name){
        this.name = name;
    }

    @Override
    public void printNameUpperCase() {
        System.out.println(this.name.toUpperCase());
    }

    @Override
    public void printName() {
        System.out.println(this.name);
    }

    @Override
    public String getName() {
        return this.name;
    }

}
