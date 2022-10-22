# Date & Time

> 기계 시간 표현법
- 기준시 UTC, GMT ( Universal Time Coordinated == Greenwich Mean Time ) 입니다.
```java
Instant instant = Instant.now();
System.out.println(instant); 
```
- 현재 위치를 기준으로 하고 싶다면 `ZoneId zoneId = ZoneId.systemDefault();`으로 하면 됩니다. 
```java
ZoneId zoneId = ZoneId.systemDefault();
System.out.println(zoneId);
ZonedDateTime zonedDateTime = instant.atZone(ZoneId.systemDefault());
System.out.println(zonedDateTime);
```
- 시간 비교
```java
Instant now = Instant.now();
Instant plus = now.plus(10, ChronoUnit.SECONDS);

Duration between = Duration.between(now, plus);
System.out.println(between.getSeconds());
```

> 사람용 시간 표현법 

```java
LocalDateTime now = LocalDateTime.now();
System.out.println(now);
LocalDateTime birthDay = LocalDateTime.of(1997, Month.DECEMBER, 17, 3, 15, 0);
System.out.println(birthDay);
```

- Period
```java
Period period = Period.between(today, thisYearBirthDay);
System.out.println(period.getDays());

Period until = today.until(thisYearBirthDay);
System.out.println(until.get(ChronoUnit.DAYS));
```

- PreDefined Format
```java
String format = DateTimeFormatter.ISO_LOCAL_DATE.format(LocalDate.of(2018, 3, 9));
System.out.println(format);
```

- Parse
```java
LocalDate parse = LocalDate.parse("12/17/1997", DateTimeFormatter.ofPattern("MM/dd/yyyy"));
System.out.println(parse);
```

> 레거시 API와 호환

- Instant
```java
// 구 > 신
Date date = new Date();
Instant instant = date.toInstant();

// 신 > 구
Date newDate = Date.from(instant);
```

- ZonedDateTime
```java
// 구 > 신
GregorianCalendar calendar = new GregorianCalendar();
ZonedDateTime dateTime = calendar.toInstant().atZone(ZoneId.systemDefault());
//신 > 구
GregorianCalendar calendar2 = GregorianCalendar.from(dateTime);
```

- ZoneId
```java
// 구 > 신
ZoneId zoneId = TimeZone.getTimeZone("PST").toZoneId();
// 신 > 구
TimeZone timeZone = TimeZone.getTimeZone(zoneId);
```
