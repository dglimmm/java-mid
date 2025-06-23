package lang.wrapper.test;

public class WrapperTest3 {

    public static void main(String[] args) {
        String str = "100";

        //String -> Integer
        Integer i1 = Integer.valueOf(str);
        System.out.println("i1 = " + i1);

        //Integer -> int
        int i = i1.intValue();
        System.out.println("i = " + i);

        //int -> Integer
        Integer i2 = Integer.valueOf(i);
        System.out.println("i2 = " + i2);

    }
}
