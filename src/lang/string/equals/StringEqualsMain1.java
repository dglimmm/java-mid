package lang.string.equals;

public class StringEqualsMain1 {

    public static void main(String[] args) {
        String str1 = new String("hello"); //x001
        String str2 = new String("hello"); //x002
        System.out.println("new String() == 비교: " + (str1 == str2));
        System.out.println("new String() equals 비교:" + (str1.equals(str2)));
        
        //문자열 풀을 사용하기때문에 == 비교도 같다고 나옴
        //같은 문자열이 있으면 문자열 풀에 넣어
        //결국 == 비교시에 문자열 풀에있는 hello문자열 객체 주소를 반환하기때문에 결국 같은 객체이다
        String str3 = "hello"; //x003
        String str4 = "hello"; //x004
        System.out.println("리터럴 == 비교: " + (str3 == str4));
        System.out.println("리터럴 equals 비교: " + (str3.equals(str4)));
    }
}
