package time;

import java.time.LocalDateTime;
import java.time.temporal.ChronoField;

public class GetTimeMain {

    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.of(2030, 1, 1, 13, 30, 59);
        System.out.println("dt.get(ChronoField.YEAR) = " + dt.get(ChronoField.YEAR));
        System.out.println("dt.get(ChronoField.MONTH_OF_YEAR) = " + dt.get(ChronoField.MONTH_OF_YEAR));
        System.out.println("dt.get(ChronoField.DAY_OF_MONTH) = " + dt.get(ChronoField.DAY_OF_MONTH));
        System.out.println("dt.get(ChronoField.HOUR_OF_DAY) = " + dt.get(ChronoField.HOUR_OF_DAY));
        System.out.println("dt.get(ChronoField.MINUTE_OF_HOUR) = " + dt.get(ChronoField.MINUTE_OF_HOUR));
        System.out.println("dt.get(ChronoField.SECOND_OF_MINUTE) = " + dt.get(ChronoField.SECOND_OF_MINUTE));

        //편의 메서드 제공
        System.out.println("dt.get(ChronoField.YEAR) = " + dt.getYear());
        System.out.println("dt.get(ChronoField.MONTH_OF_YEAR) = " + dt.getMonthValue());
        System.out.println("dt.get(ChronoField.DAY_OF_MONTH) = " + dt.getDayOfMonth());
        System.out.println("dt.get(ChronoField.HOUR_OF_DAY) = " + dt.getHour());
        System.out.println("dt.get(ChronoField.MINUTE_OF_HOUR) = " + dt.getMinute());
        System.out.println("dt.get(ChronoField.SECOND_OF_MINUTE) = " + dt.getSecond());

        //편의 메서드에 없는경우
        System.out.println("dt.get(ChronoField.MINUTE_OF_DAY) = " + dt.get(ChronoField.MINUTE_OF_DAY));
        System.out.println("dt.get(ChronoField.SECOND_OF_DAY) = " + dt.get(ChronoField.SECOND_OF_DAY));
    }
}
