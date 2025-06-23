package lang.string.builder;

public class StringBuilderMain1_2 {

    public static void main(String[] args) {
        
        //StringBuilder는 메서드 체이닝으로 쓴다
        StringBuilder stringBuilder = new StringBuilder();
        String string = stringBuilder.append("A").append("B").append("C").append("D")
                .insert(2, "Java").delete(2,6).reverse().toString();

        System.out.println("string = " + string);
    }
}
