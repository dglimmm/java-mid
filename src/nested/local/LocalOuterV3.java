package nested.local;

import java.lang.reflect.Field;

public class LocalOuterV3 {

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
//        pr.print();
        return pr;
    }

    public static void main(String[] args) {
        LocalOuterV3 localOuterV1 = new LocalOuterV3();
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
