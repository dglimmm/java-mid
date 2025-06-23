package lang.string.method;

public class StringSplitJoinMain {

    public static void main(String[] args) {
        String str = "Apple,Banana,Orange";

        String[] split = str.split(",");
        for (String s : split) {
            System.out.println(s);
        }

        //join()
        String join = String.join("-", "A", "B", "C");
        System.out.println("연결" + join);

        //문자열 배열 연결
        String join1 = String.join("-", split);
        System.out.println("join1 = " + join1);
    }
}
