package chapter_1.FunctionalInterface_and_lambda.diy;


import java.util.function.Function;

/**
 * 자바가 제공하는 Function 인터페이스를 상속
 * */
public class JavaFunctionInterface implements Function<Integer,Integer> {

    @Override
    public Integer apply(Integer integer) {
        return integer + 10;
    }
}
