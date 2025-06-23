package lang.string.immutable;

public class StringImmutable1 {

    public static void main(String[] args) {
        String str = "hello";
        String str2 = str.concat(" java"); //String은 불변객체여서 concat 하면 새로운 값을 반환함
        System.out.println("str = " + str);
        System.out.println("str2 = " + str2);
    }
}
