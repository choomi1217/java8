package chapter_1.FunctionalInterface_and_lambda.lambdas;

import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.Supplier;

public class LambdaMain {

    public void main(String[] args) {
        Supplier<Integer> get10 = () -> {
            return 10;
        };

        Foo foo = new Foo();
        foo.run();


    }

    public class Foo {
        public void run(){

            int baseNum = 10;

            class LocalClass{
                void printBaseNum(){
                    int baseNum = 10000;
                    System.out.println(baseNum);
                }
            }

            LocalClass localClass = new LocalClass();
            localClass.printBaseNum();

            Consumer<Integer> integerConsumer = new Consumer<Integer>() {
                @Override
                public void accept(Integer integer) {
                    int baseNum = 10000;
                    System.out.println(integer + baseNum);
                }
            };
            integerConsumer.accept(1);

            IntConsumer printInt = (i) -> {
                System.out.println(i + baseNum);
            };

            printInt.accept(10);
        }
    }

}
