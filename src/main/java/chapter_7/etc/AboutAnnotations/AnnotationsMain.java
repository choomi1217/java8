package chapter_7.etc.AboutAnnotations;

import java.util.Arrays;
@Chicken("양념")
@Chicken("후라이드")
public class AnnotationsMain {
/*

    public static void main(String[] args) {
        Chicken[] chickens = AnnotationsMain.class.getAnnotationsByType(Chicken.class);
        Arrays.stream(chickens).forEach(chicken -> {
            System.out.println(chicken.value());
        });

        ChickenContainer annotation = AnnotationsMain.class.getAnnotation(ChickenContainer.class);
        Arrays.stream(annotation.value()).forEach(chicken -> {
            System.out.println(chicken.value());
        });

    }

*/
}
