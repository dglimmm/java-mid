package lang.string.method;

public class StringUtilsMain2 {

    public static void main(String[] args) {
        int num = 100;
        boolean bool = true;
        String s = "Hello, Java!";

        String format = String.format("num: %d, bool: %b, str: %s", num, bool, s);
        System.out.println("format = " + format);

        String format1 = String.format("숫자: %.2f", 10.1234);
        System.out.println("format1 = " + format1);

        System.out.printf("숫자: %.3f\n", 10.1234);


    }
}
