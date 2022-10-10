package chapter_3.Stream.Stream;

import chapter_3.Stream.Stream.examples.OnlineClass;
import java.util.ArrayList;
import java.util.List;

public class StreamMain {

    public static void main(String[] args) {
        List<OnlineClass> springClasses = new ArrayList<>();
        springClasses.add(new OnlineClass(1, "spring - 1", true));
        springClasses.add(new OnlineClass(2, "spring - 2", true));
        springClasses.add(new OnlineClass(3, "spring - 3", false));
        springClasses.add(new OnlineClass(4, "spring - 4", false));
        springClasses.add(new OnlineClass(5, "spring - 5", false));


        List<OnlineClass> javaClasses = new ArrayList<>();
        javaClasses.add(new OnlineClass(1, "java - 1", true));
        javaClasses.add(new OnlineClass(2, "java - 2", true));
        javaClasses.add(new OnlineClass(3, "java - 3", false));
        javaClasses.add(new OnlineClass(4, "java - 4", false));
        javaClasses.add(new OnlineClass(5, "java - 5", false));

        List<List<OnlineClass>> oomiEvents = new ArrayList<>();
        oomiEvents.add(springClasses);
        oomiEvents.add(javaClasses);

        System.out.println(" Spring으로 시작 하는 수업 ");

        System.out.println(" close 되지 않은 수업 ");

        System.out.println(" 수업 이름만 모아서 스트림 만들기 ");

        System.out.println(" 두 수업 목록에 들어있는 모든 수업 아이디 출력 ");

        System.out.println(" 10부터 1씩 증가하는 무제한 스트림 중에서 앞에 10개 빼고 최대 10개 까지만 ");

        System.out.println(" 자바 수업 중에 Test가 들어있는 수업이 있는지 확인 ");

        System.out.println(" 스프링 수업 중에 제목에 spring이 들어간 것만 모아서 List로 만들기 ");

    }

}
