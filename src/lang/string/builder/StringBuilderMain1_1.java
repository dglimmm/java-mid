package lang.string.builder;

public class StringBuilderMain1_1 {

    public static void main(String[] args) {
        
        //String은 불변객체, 스트링 빌더는 가변객체
        //따라서 반환값 없이 그 자체가 변함
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("A");
        stringBuilder.append("B");
        stringBuilder.append("C");
        stringBuilder.append("D");

        System.out.println("stringBuilder = " + stringBuilder);
        stringBuilder.insert(2, "Java");
        System.out.println("stringBuilder = " + stringBuilder);

        stringBuilder.delete(2, 6);
        System.out.println("stringBuilder = " + stringBuilder);

        stringBuilder.reverse();
        System.out.println("stringBuilder = " + stringBuilder);
        
        //마지막에 StringBuilder -> String
        String string = stringBuilder.toString();
        System.out.println("string = " + string);
    }
}
