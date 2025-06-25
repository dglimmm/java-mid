package time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormattingMain2 {

    public static void main(String[] args) {
        //포맷팅 : 날짜와 시간을 문자로
        LocalDateTime localDateTime = LocalDateTime.of(2024, 12, 31, 13, 30, 59);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String format = localDateTime.format(formatter);
        System.out.println("format = " + format);
        System.out.println("localDateTime = " + localDateTime);

        //파싱: 문자를 날짜와 시간으로
        String dateTimeString = "2030-12-31 13:30:59";
        LocalDateTime parse = LocalDateTime.parse(dateTimeString, formatter);
        System.out.println("parse = " + parse);
    }
}
