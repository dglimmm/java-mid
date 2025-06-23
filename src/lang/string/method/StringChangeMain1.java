package lang.string.method;

public class StringChangeMain1 {

    public static void main(String[] args) {
        String str = "Hello, Java! Welcome to Java.";

        System.out.println("인덱스 7부터의 부분 문자열: "+ str.substring(7));
        System.out.println("인덱스 7부터 12의 부분 문자열: "+ str.substring(7, 12));

        System.out.println("Java 를 world로 교체" + str.replace("Java", "dong"));
        System.out.println("Java 를 world로 교체" + str.replaceFirst("Java", "dong"));

    }
}
