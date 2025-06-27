package nested.anonymous.ex;

public class Ex0RefMain {

    public static void hello(String msg){
        System.out.println("프로그램 시작"); //불변
        System.out.println(msg); //변함
        System.out.println("프로그램 종료"); //불변
    }

    public static void main(String[] args) {
        hello("Hello Java");
        hello("Hello Spring");
    }
    
    //프로그래밍의 핵심은 변하는부분과 변하지않는 부분을 분리해서 변하는 부분만 외부에서 받는 방식으로 구현
}
