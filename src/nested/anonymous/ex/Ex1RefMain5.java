package nested.anonymous.ex;

import java.util.Random;

public class Ex1RefMain5 {
    //람다 활용(코드 조각만 던지기)
    public static void hello(Process process){
        System.out.println("프로그램 시작");
        //코드조각 시작
        process.run();
        //코드조각 종료
        System.out.println("프로그램 종료");
    }
    
    public static void main(String[] args) {

        hello(() -> {
            int randomValue = new Random().nextInt(6) + 1;
            System.out.println("주사위 = " + randomValue);
        });
        hello(() -> {
            for (int i = 0; i < 3; i++) {
                System.out.println("i = " + i);
            }
        });
    }

}
