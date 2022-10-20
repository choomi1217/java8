package chapter_3.Stream.Stream;

import common.OnlineClass;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

        List<List<OnlineClass>> oomiEvents = new ArrayList<>();
        oomiEvents.add(springClasses);
        oomiEvents.add(javaClasses);

        System.out.println("----- Spring 으로 시작하는 수업 -----");
        springClasses.stream()
            .filter(onlineClass -> onlineClass.getTitle().startsWith("spring"))
            .forEach(onlineClass -> System.out.println("id : " + onlineClass.getId()));

        //이렇게 하면 springClasses와 javaClasses가 나오긴 하지만... Object 배열이기도 하고 그 안에서 springClasses인 것만 찾기가 어려워..
        Object[] objects = oomiEvents.stream().toArray();
        System.out.println("-------------------------");
        System.out.println("-------------------------");
        
        System.out.println("----- close 되지 않은 수업 첫번째 방법 -----");
        springClasses.stream()
            .filter(onlineClass -> !onlineClass.isClosed())
            .forEach(onlineClass -> System.out.println("id : " + onlineClass.getId()));

        System.out.println("----- close 되지 않은 수업 두번째 방법 -----");
       /* 
       // ㅠㅠ 자바 11에서 되고 8엔 없는 메소드
       springClasses.stream()
            .filter(Predicate.not(OnlineClass::isClosed))
            .forEach(onlineClass -> System.out.println("id : " + onlineClass.getId()));
        */

        System.out.println("----- 수업 이름만 모아서 스트림 만들기 -----");
        springClasses.stream()
            .map(OnlineClass::getTitle)
            .forEach(System.out::println);

        System.out.println("----- 두 수업 목록에 들어있는 모든 수업 제목 출력 -----");
        oomiEvents.stream().flatMap(Collection::stream)
                .forEach(onlineClass -> System.out.println("title : " + onlineClass.getTitle()));

        System.out.println("----- 10부터 1씩 증가하는 무제한 스트림 중에서 앞에 10개 빼고 최대 10개 까지만 -----");
        Stream.iterate(10, integer -> integer + 1)
            .skip(10)
            .limit(10)
            .forEach(System.out::println);

        System.out.println("----- 자바 수업 중에 Test가 들어있는 수업이 있는지 확인 -----");
        boolean match = javaClasses.stream()
            .anyMatch(onlineClass -> onlineClass.getTitle().contains("Test"));
        System.out.println(match);

        System.out.println("----- 스프링 수업 중에 제목에 spring이 들어간 제목만 모아서 List로 만들기 -----");
        List<String> stringList = springClasses.stream()
            .map(OnlineClass::getTitle)
            .filter(title -> title.contains("spring"))
            .collect(Collectors.toList());

        stringList.stream().forEach(System.out::println);
    }

}
