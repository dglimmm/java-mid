package lang.system;

import java.util.Arrays;

public class SystemMain {
    public static void main(String[] args) {
        //현재 시간(밀리초)을 가져온다.
        long currentTimeMillis = System.currentTimeMillis();
        System.out.println("currentTimeMillis = " + currentTimeMillis);

        //나노초
        long nanoedTime = System.nanoTime();
        System.out.println("nanoedTime = " + nanoedTime);

        //환경 변수를 읽는다.,(운영체제)
        System.out.println("getenv = " + System.getenv());

        //시스템 속성을 읽는다.(자바사용)
        System.out.println("properties" + System.getProperties());
        System.out.println("Java version: "+ System.getProperty("java.version"));

        //배열을 고속으로 복사한다
        char[] originalArray = {'h', 'e', 'l', 'l', 'o'};
        char[] copiedArray = new char[5];
        System.arraycopy(originalArray,0,copiedArray,0,originalArray.length);

        System.out.println("Arrays.toString = " + Arrays.toString(copiedArray));

        //프로그램 종료
        System.exit(0);
        System.out.println("hello");
    }
}
