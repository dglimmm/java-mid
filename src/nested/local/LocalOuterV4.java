package nested.local;

import java.lang.reflect.Field;

public class LocalOuterV4 {

    private final int outInstanceVar = 3;

    public Printer process(int paramVar){
        final int localVar = 1; //지역변수는 스택 프레임이 종료되는 순간 함께 제거된다

        class LocalPrinter implements Printer{
            final int value = 0;

            @Override
            public void print() {
                System.out.println("value = " + value);
                System.out.println("localVar = " + localVar);
                System.out.println("paramVar = " + paramVar);
                System.out.println("outInstanceVar = " + outInstanceVar);
            }
        }

        LocalPrinter pr = new LocalPrinter();
        //만약 localVar 의 값을 변경한다면 ? 다시 캡쳐해야하나 ??
        //localprinter 를 생성하는 시점에 지역변수인 localVar, paramVar를 캡쳐한다
        //동기화 문제가 발생한다 ,디버깅을 어렵게한다(예상치못한 변경, 사이드 이펙트),
        return pr;
    }

    public static void main(String[] args) {
        LocalOuterV4 localOuterV1 = new LocalOuterV4();
        Printer printer = localOuterV1.process(20);
        printer.print();

        //추가(캡처링 확인)
        System.out.println("필드 확인");
        Field[] declaredFields = printer.getClass().getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println("declaredField = " + declaredField);
        }
    }
}
