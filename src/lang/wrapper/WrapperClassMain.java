package lang.wrapper;

public class WrapperClassMain {

    public static void main(String[] args) {
        Integer i = new Integer(11);//deprecated 미래에 삭제 예정 ,대신에 valueOf() 사용
        Integer i1 = Integer.valueOf(11);// -128~127 자주 사용하는 숫자 값 재사용, 불변, 박싱
        Long l = Long.valueOf(100);
        Double v = Double.valueOf(10.5);
        System.out.println("v = " + v);
        System.out.println("l = " + l);//toString 도 구현되어있음
        System.out.println("i1 = " + i1);
        System.out.println("i = " + i);

        //값꺼낼 수 있음
        //언박싱
        int i2 = i1.intValue();
        long l1 = l.longValue();

        System.out.println("비교");
        System.out.println("==: "+ (i == i1)); //false
        System.out.println("equals: "+ i.equals(i1));

    }
}
