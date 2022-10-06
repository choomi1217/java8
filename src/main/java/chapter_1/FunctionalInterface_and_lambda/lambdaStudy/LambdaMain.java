package chapter_1.FunctionalInterface_and_lambda.lambdaStudy;

import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.Supplier;

public class LambdaMain {
/*

    public static void main(String[] args) {
        Supplier<Integer> get10 = () -> {
            return 10;
        };

        Foo foo = new Foo();
        foo.run();

    }

    public static class Foo {
        public void run(){

            final int baseNum = 10;

            //로컬클래스
            class LocalClass{
                void printBaseNum(){
                    int baseNum = 10000; //섀도잉
                    System.out.println(baseNum);
                }
            }

            LocalClass localClass = new LocalClass();
            localClass.printBaseNum();

            //익명클래스
            Consumer<Integer> integerConsumer = new Consumer<Integer>() {
                @Override
                public void accept(Integer baseNum) {
                    System.out.println(baseNum);
                }
            };
            integerConsumer.accept(1);

            //람다
            IntConsumer printInt = (i) -> {
                System.out.println(i + baseNum);
            };

            printInt.accept(10);
        }
    }
*/

}
