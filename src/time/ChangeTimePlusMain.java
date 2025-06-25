package time;

import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class ChangeTimePlusMain {

    public static void main(String[] args) {
        //날짜와 시간을 조작하기
        LocalDateTime dt = LocalDateTime.of(2025, 1, 1, 13, 30, 59);
        System.out.println("dt = " + dt);

        LocalDateTime plus = dt.plus(10, ChronoUnit.YEARS);
        System.out.println("plus = " + plus);

        LocalDateTime plusYears = dt.plusYears(10);
        System.out.println("plusYears = " + plusYears);

        //10년의 기간을 만들어서 넣어주기
        Period period = Period.ofYears(10);
        LocalDateTime plus1 = dt.plus(period);
        System.out.println("plus1 = " + plus1);

    }
}
