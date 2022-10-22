package chapter_4.Optional;

import common.OnlineClass;
import common.Progress;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalMain {
/*

    public static void main(String[] args) {
        List<OnlineClass> springClass = new ArrayList<>();
        springClass.add(new OnlineClass(1, "spring boot - 1" , true));
        springClass.add(new OnlineClass(2, "spring boot - 2" , true));
        springClass.add(new OnlineClass(3, "spring boot - 3" , false));
        springClass.add(new OnlineClass(4, "spring boot - 4" , false));
        springClass.add(new OnlineClass(5, "spring boot - 5" , false));

        OnlineClass springBoot = new OnlineClass(1, "spring boot", false);
        springBoot.getProgress();

        Optional<OnlineClass> optional = springClass.stream()
            .filter(onlineClass -> onlineClass.getTitle().startsWith("spring"))
            .findFirst();

        boolean present = optional.isPresent();
        OnlineClass aClass = optional.get();

        optional.ifPresent(onlineClass -> System.out.println(onlineClass.getTitle()));
        optional.orElseThrow(IllegalStateException::new);

        OnlineClass bClass = optional.orElse(createNewClass());
        System.out.println(bClass.getTitle());

        OnlineClass cClass = optional.orElseGet(OptionalMain::createNewClass);
        System.out.println(cClass.getTitle());

        Optional<String> optionalTitle = optional.map(OnlineClass::getTitle);
        System.out.println(optionalTitle.isPresent());

        Optional<Optional<Progress>> optionalProgress = optional.map(OnlineClass::getProgress);
        Optional<Progress> progress1 = optional.map(OnlineClass::getProgress).orElseThrow();
        Optional<Progress> progress2 = optional.flatMap(OnlineClass::getProgress);


    }
*/

    private static OnlineClass createNewClass() {
        return new OnlineClass(6, "spring boot - 6", false);
    }
}
