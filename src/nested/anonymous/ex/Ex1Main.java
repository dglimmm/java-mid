package nested.anonymous.ex;

import nested.local.Printer;

import java.util.Random;

public class Ex1Main {
    //정적 중첩클래스 활용
    public static void hello(Process process){
        System.out.println("프로그램 시작");
        //코드조각 시작
        process.run();
        //코드조각 종료
        System.out.println("프로그램 종료");
    }

    static class Dice implements Process{

        @Override
        public void run() {
            int randomValue = new Random().nextInt(6) + 1;
            System.out.println("주사위 = " + randomValue);
        }
    }

    static class Sum implements Process{

        @Override
        public void run() {
            for (int i = 0; i < 3; i++) {
                System.out.println("i = " + i);
            }
        }
    }

    public static void main(String[] args) {
        hello(new Dice());
        hello(new Sum());
    }

}
