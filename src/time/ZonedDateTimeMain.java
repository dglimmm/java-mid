package time;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeMain {

    public static void main(String[] args) {
        ZonedDateTime nowZdt = ZonedDateTime.now();
        System.out.println("nowZdt = " + nowZdt);

        LocalDateTime ldt = LocalDateTime.of(2030, 1, 1, 13, 30, 50);
        ZonedDateTime zonedDateTime = ZonedDateTime.of(ldt, ZoneId.of("Asia/Seoul"));
        System.out.println("zonedDateTime = " + zonedDateTime);

        ZonedDateTime zonedDateTime1 = ZonedDateTime.of(2030, 1, 1, 13, 30, 0, 0, ZoneId.of("Asia/Seoul"));
        System.out.println("zonedDateTime1 = " + zonedDateTime1);

        //타임존 변경
        ZonedDateTime utc = zonedDateTime1.withZoneSameInstant(ZoneId.of("UTC"));
        System.out.println("utc = " + utc);


    }
}
