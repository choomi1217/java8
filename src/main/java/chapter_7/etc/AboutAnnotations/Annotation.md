# Annotation

> 1.8부터 추가된 애노테이션의 타입

```java
    /**
     * Type parameter declaration
     *
     * @since 1.8
     */
    TYPE_PARAMETER,

    /**
     * Use of a type
     *
     * @since 1.8
     */
    TYPE_USE,
```

```java
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE_USE)
public @interface Chicken {

}
```

```java
@Chicken
public class AnnotationsMain {

    public static void main(@Chicken String[] args) throws @Chicken RuntimeException{
        List<@Chicken String> names = Arrays.asList("keesun");
    }

    static class FeelsLikeChicken<@Chicken T>{
        public static <@Chicken C> void print(@Chicken C c){
            System.out.println(c);
        }
    }

}
```

---


> Repeatable


```java
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE_USE)
@Repeatable(ChickenContainer.class)
public @interface Chicken {
    String value();
}
```

```java
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE_USE)
public @interface ChickenContainer {
    Chicken[] value();
}
```

```java
import java.util.Arrays;

@Chicken("양념")
@Chicken("후라이드")
public class AnnotationsMain {

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
}
```

