package chapter_5.DateTime;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class DateTimeApiMain {
/*
    public static void main(String[] args) {

        // 기계용
        Instant instant = Instant.now();
        System.out.println(instant);
        System.out.println(instant.atZone(ZoneId.of("UTC")));

        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println(zoneId);

        ZonedDateTime zonedDateTime = instant.atZone(ZoneId.systemDefault());
        System.out.println(zonedDateTime);

        ZonedDateTime nowInKorea = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
        System.out.println(nowInKorea);

        Instant now = Instant.now();
        Instant plus = now.plus(10, ChronoUnit.SECONDS);

        Duration between = Duration.between(now, plus);
        System.out.println(between.getSeconds());

        // 사람용
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        LocalDateTime birthDay = LocalDateTime.of(1997, Month.DECEMBER, 17, 3, 15, 0);
        System.out.println(birthDay);

        LocalDate today = LocalDate.now();
        LocalDate thisYearBirthDay = LocalDate.of(2020, Month.JANUARY, 1);

        Period period = Period.between(today, thisYearBirthDay);
        System.out.println(period.getDays());

        Period until = today.until(thisYearBirthDay);
        System.out.println(until.get(ChronoUnit.DAYS));

        // 포맷팅
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        System.out.println(now.format(formatter));

        System.out.println(DateTimeFormatter.ISO_LOCAL_DATE.format(LocalDate.of(2018, 3, 9)));
        System.out.println(DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(LocalDateTime.now()));

        LocalDate parse = LocalDate.parse("12/17/1997", DateTimeFormatter.ofPattern("MM/dd/yyyy"));
        System.out.println(parse);


        //레거시 api 호환
        // 구 > 신
        Date date = new Date();
        Instant instant = date.toInstant();

        // 신 > 구
        Date newDate = Date.from(instant);

        // 구 > 신
        GregorianCalendar calendar = new GregorianCalendar();
        ZonedDateTime dateTime = calendar.toInstant().atZone(ZoneId.systemDefault());
        //신 > 구
        GregorianCalendar calendar2 = GregorianCalendar.from(dateTime);

        // 구 > 신
        ZoneId zoneId = TimeZone.getTimeZone("PST").toZoneId();
        // 신 > 구
        TimeZone timeZone = TimeZone.getTimeZone(zoneId);
    }
*/
}
