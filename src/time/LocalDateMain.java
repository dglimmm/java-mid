package time;

import java.time.LocalDate;

public class LocalDateMain {

    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println("now = " + now); //오늘날짜

        LocalDate ofDate = LocalDate.of(2013, 11, 12);
        System.out.println("ofDate = " + ofDate); //지정날짜

        ofDate = ofDate.plusDays(19);
        System.out.println("ofDate = " + ofDate);// 불변 객체이기때문에 플러스한 날을 받아야함
    }
}
