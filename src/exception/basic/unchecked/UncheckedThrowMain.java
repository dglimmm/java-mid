package exception.basic.unchecked;

public class UncheckedThrowMain {

    public static void main(String[] args) {
        Service service = new Service();
        service.callThrow();//main 밖으로 exception 을 던지기때문에 정상종료가 안찍히고 종료
        System.out.println("정상 종료");
    }
}
