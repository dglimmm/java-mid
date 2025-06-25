package time;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;

public class ChangeTimeWithMain {

    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.of(2018, 1, 1, 13, 30, 59);
        System.out.println("localDateTime = " + dt);

        //with 를 쓰면 나머지는 그대로 두고 새로 넘어온 year만 바꿀 수 있다
        LocalDateTime with = dt.with(ChronoField.YEAR, 2020);
        System.out.println("with = " + with);

        //편의 메서드가 있다
        LocalDateTime localDateTime = dt.withYear(2024);
        System.out.println("localDateTime = " + localDateTime);

        //TemporalAdjuster 사용
        //다음주 금요일
        LocalDateTime with1 = dt.with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
        System.out.println("다음주 금요일 = " + with1);

        //이번달의 마지막 일요일
        LocalDateTime with2 = dt.with(TemporalAdjusters.lastInMonth(DayOfWeek.SUNDAY));
        System.out.println("이번달의 마지막 일요일 = " + with2);
    }
}
