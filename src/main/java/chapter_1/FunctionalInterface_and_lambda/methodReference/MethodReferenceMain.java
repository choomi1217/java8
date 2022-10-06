package chapter_1.FunctionalInterface_and_lambda.methodReference;

import java.util.Arrays;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.logging.Logger;

public class MethodReferenceMain {

    public static void main(String[] args) {
        /*
        UnaryOperator<String> sayHi = (name) -> {
            return "hi" + name;
        };
        */
        UnaryOperator<String> sayHi = Greeting::sayHi;
        System.out.println(sayHi.apply("앵미1"));

        Greeting greeting = new Greeting();
        UnaryOperator<String> sayHello = greeting::sayHello;
        System.out.println(sayHello.apply("앵미2"));

        Supplier<Greeting> greetingSupplier = Greeting::new;
        Greeting supplyGreeting = greetingSupplier.get();
        System.out.println(supplyGreeting.sayHello("앵미3"));

        Function<String , Greeting> greetingFunction = Greeting::new;
        Greeting functionGreeting = greetingFunction.apply("앵미4");
        System.out.println(functionGreeting.getName());

        String[] names = {"b", "a", "c"};
        Arrays.sort(names, String::compareToIgnoreCase);
        System.out.println(Arrays.toString(names));
    }

}
