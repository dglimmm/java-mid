package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeMain {

    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime ofDt = LocalDateTime.of(2014, 8, 14, 8, 12, 10);

        System.out.println("now = " + now);
        System.out.println("ofDt = " + ofDt);

        //날짜를 분리하고 합칠 수 있음
        LocalDate localDate = ofDt.toLocalDate();
        LocalTime localTime = ofDt.toLocalTime();
        System.out.println("localDate = " + localDate);
        System.out.println("localTime = " + localTime);

        //합계
        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);
        System.out.println("localDateTime = " + localDateTime);

        //계산
        LocalDateTime plussedDays = ofDt.plusDays(1000);
        System.out.println("plussedDays = " + plussedDays);
        LocalDateTime plusYears = ofDt.plusYears(2);
        System.out.println("plusYears = " + plusYears);

        //비교
        System.out.println("현재 보다 지정날짜가 이전인가? " + now.isBefore(ofDt));
        System.out.println("현재 보다 지정날짜가 이후인가? " + now.isAfter(ofDt));
        System.out.println("현재날짜시간과 지정 날짜시간이 같은가? " + now.isEqual(ofDt));//시간적으로 같으면 같은거임, 
        //우리나라에서 9시에 영국에 전화했는데 받았을때 그때 시간이 같은거임 한국 9시와 영국의 0시가 같다
        //타임존이 달라도 시간적으로 같으면 true
        

    }
}
