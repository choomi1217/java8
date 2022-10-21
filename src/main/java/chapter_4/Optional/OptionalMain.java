package chapter_4.Optional;

import common.OnlineClass;
import common.Progress;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalMain {

    public static void main(String[] args) {
        List<OnlineClass> springClass = new ArrayList<>();
        springClass.add(new OnlineClass(1, "spring boot - 1" , true));
        springClass.add(new OnlineClass(2, "spring boot - 2" , true));
        springClass.add(new OnlineClass(3, "spring boot - 3" , false));
        springClass.add(new OnlineClass(4, "spring boot - 4" , false));
        springClass.add(new OnlineClass(5, "spring boot - 5" , false));

        OnlineClass springBoot = new OnlineClass(1, "spring boot", false);
        springBoot.getProgress();

        Optional<OnlineClass> spring = springClass.stream()
            .filter(onlineClass -> onlineClass.getTitle().startsWith("spring"))
            .findFirst();

        boolean present = spring.isPresent();

    }
}
