package chapter_1.FunctionalInterface_and_lambda.diy;


/**
 * 내가 함수형 인터페이스 만들기
 * */
@java.lang.FunctionalInterface
public interface MyFunctionalInterface {

    void doSomething();

    static void printName(){
        System.out.println(" good morning oomi");
    }
    
    default void printAge(){
        System.out.println("26살");
    }

}
