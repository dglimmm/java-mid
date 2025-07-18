package time.test;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class TestLoopPlus {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2024, 1, 1);
        System.out.println("localDate = " + localDate);

        for (int i = 0; i < 5; i++) {
            LocalDate plusWeeks = localDate.plus(2*i, ChronoUnit.WEEKS);
            System.out.println("날짜 " + (i+1)+": " + plusWeeks);
        }
    }
}
