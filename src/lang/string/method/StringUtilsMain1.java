package lang.string.method;

public class StringUtilsMain1 {

    public static void main(String[] args) {
        int num = 100;
        boolean bool = true;
        Object o = new Object();
        String s = "Hello, Java!";

        //valueOf 메서드
        String s1 = String.valueOf(num);
        System.out.println("숫자의 문자열 값 = " + s1);
        String s2 = String.valueOf(bool);
        System.out.println("불린의 문자열 값 = " + s2);


        
    }
}
