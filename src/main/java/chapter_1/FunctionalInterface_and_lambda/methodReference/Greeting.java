package chapter_1.FunctionalInterface_and_lambda.methodReference;

public class Greeting {

    private String name;

    public Greeting(){}

    public Greeting(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String sayHello(String name){
        return "hello" + name;
    }

    public static String sayHi(String name){
        return "hi" + name;
    }

}
