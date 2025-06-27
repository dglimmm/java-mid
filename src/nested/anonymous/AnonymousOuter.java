package nested.anonymous;

import nested.local.Printer;

public class AnonymousOuter {

    private int outInstanceVar = 3;

    public void process(int paramVar){
        int localVar = 1;

        //익명클래스 사용 생성과 동시에 내부 구현
        //익명클래스는 부모클래스를 상속 받거나, 또는 인터페이스를 구현해야한다.
        //익명클래스를 왜쓰냐 ?
        //클래스를 별도로 정의하지않고도 인터페이스나 추삭클래스를 즉석에서 구현할 수 있어서 코드가 더 간결함
        //익명클래스는 단한번만 인스턴스를 생성할 수 있음
        Printer printer = new Printer() {
            //익명클래스의 본문(body)
            int value = 0;

            @Override
            public void print() {
                System.out.println("value = " + value);
                System.out.println("localVar = " + localVar);
                System.out.println("paramVar = " + paramVar);
                System.out.println("outInstanceVar = " + outInstanceVar);
            }
        };
        printer.print();
        System.out.println(printer.getClass());
    }

    public static void main(String[] args) {
        AnonymousOuter main = new AnonymousOuter();
        main.process(20);
    }
}
