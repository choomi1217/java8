package chapter_1.FunctionalInterface_and_lambda.funtionalInterface;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class FunctionalMain {
/*

    public static void main(String[] args) {
        // 익명 내부 클래스 ( anonymous inner class )
        MyFunctionalInterface myFunctionalInterface = new MyFunctionalInterface() {
            @Override
            public void doSomething() {
                System.out.println("Hi~!");
            }
        };
        myFunctionalInterface.doSomething();

        //람다 ( lambda )
        MyFunctionalInterface myLambda = () -> System.out.println("Hi lambda~!");
        myLambda.doSomething();

        MyFunctionalInterface myLambda2 = () -> {
            System.out.println("Hi~!!");
            System.out.println("lambda lambda~!");
        };
        myLambda2.doSomething();

        // 순수함수
        PureFunction pureFunction = (number) -> number + 10;
        System.out.println("pureFunction : " + pureFunction.plus(1));

        PureFunction notPure1 = new PureFunction() {
            int baseNumber = 10;
            @Override
            public int plus(int number) {
                return number + baseNumber;
            }
        };

        // Java Function class 상속받아 만든 함수형 인터페이스
        JavaFunctionInterface javaFunctionInterface = new JavaFunctionInterface();
        System.out.println("javaFunctionInterface : " + javaFunctionInterface.apply(2));


        // 람다를 이용해 함수형 인터페이스 만들기
        Function<Integer, Integer> plus10 = (number) -> number+10;
        Function<Integer, Integer> multiply2 = (number) -> number*2;
        // apply
        System.out.println("plus10 : " + plus10.apply(3));
        System.out.println("multiply2 : " + multiply2.apply(2));
        //compose
        Function<Integer, Integer> multiply2AndPlus10 = plus10.compose(multiply2);
        System.out.println("multiply2AndPlus10 : " + multiply2AndPlus10.apply(3));
        //adnThen
        Function<Integer, Integer> plus10AndMultiply2 = plus10.andThen(multiply2);
        System.out.println("plus10AndMultiply2 : " + plus10AndMultiply2.apply(3));

        //BiFunction
        BiFunction<Integer,Integer,Integer> biFunction = (number1, number2) -> number1 + number2;
        System.out.println("biFunction : " + biFunction.apply(10,10));

        //Consumer
        Consumer<Integer> printT = (number) -> System.out.println("consumer : " + number);
        printT.accept(10);

        //Supplier
        Supplier<Integer> get10 = () -> 10;
        System.out.println("supplier : " + get10.get());

        //Predicate
        Predicate<String> startWithCho = string -> string.startsWith("cho");
        System.out.println("predicate : " + startWithCho.test("cho"));

        //UnaryOperator
        UnaryOperator<Integer> unaryOperator = (number) -> number + 10;
        System.out.println("UnaryOperator : " + unaryOperator.apply(5));

        //binaryOperator
        BinaryOperator<Integer> binaryOperator = (number1, number2) -> number1 + number2;
        System.out.println("binaryOperator : " + binaryOperator.apply(20,20));

    }
*/


}
