package lang.string.chaining;

public class MethodChainingMain2 {

    public static void main(String[] args) {
        ValueAdder valueAdder = new ValueAdder();
        // 자신의 참조값을 반환하기때문에 메서드체이닝 가능(반환된 참조값을 통해 .으로 접근해)
        int result = valueAdder.add(1).add(2).add(3).getValue();

        System.out.println("result = " + result);

    }
}
