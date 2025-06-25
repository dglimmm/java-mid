package time;

import java.time.LocalTime;

public class LocalTimeMain {

    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        LocalTime localTime = LocalTime.of(9, 10, 30);

        System.out.println("now 시간 = " + now);
        System.out.println("지정시간 = " + localTime);

        //계산(불변)
        LocalTime localTime1 = localTime.plusSeconds(30);
        System.out.println("localTime1 = " + localTime1);
    }
}
