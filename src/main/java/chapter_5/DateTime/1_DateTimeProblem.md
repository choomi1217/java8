# Date & Time

기존에 사용하던 클래스들
```java
Date date = new Date();
Calendar calendar = new GregorianCalendar();
SimpleDateFormat format = new SimpleDateFormat();
```
Java8에선 불편한 점이 많아서 개선했습니다.

1. Mutable하다.
   - 47초에서 3초 후를 50을 찍고 setter를 통해 값을 변경할 수 있다는 점에서 Mutable하다고 합니다.
   - Immutable 하려면 기존의 객체의 값을 변경하는 것이 아니라 변경된 새로운 객체를 만들어서 돌려줘야 합니다.
```text
Sat Oct 22 21:47:47 KST 2022
1666442867294
Sat Oct 22 21:47:50 KST 2022
Sat Oct 22 21:47:47 KST 2022
```
```java
Date date = new Date();
long time = date.getTime();
System.out.println(date); //21:47:47
System.out.println(time);

Thread.sleep(1000 * 3);

Date after3Seconds = new Date();
System.out.println(after3Seconds); //21:47:50
after3Seconds.setTime(time);
System.out.println(after3Seconds); //21:47:47
```

2. 타입안정성이 없어 버그가 발생할 수 있다.

위처럼 `10`으로 적으면 10월이 아니고 11월이 됩니다.
꼭 `Calendar.NOVEMBER`라고 적어야 합니다.
또한 `2022`, `22` 자리에 `100`이란 숫자가 들어올 수도 있기 때문에 숫자를 변수로 받는 것보다 enum을 받도록 변경 되는것이 좋습니다.
```java
Calendar calendar = new GregorianCalendar(2022, 10, 22);
Calendar calendar = new GregorianCalendar(2022, Calendar.NOVEMBER, 22);
Calendar calendar = new GregorianCalendar(2022000, Calendar.NOVEMBER, 22000);
```


