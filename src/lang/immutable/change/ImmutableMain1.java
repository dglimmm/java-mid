package lang.immutable.change;

public class ImmutableMain1 {

    public static void main(String[] args) {
        ImmutableObj immutableObj1 = new ImmutableObj(10);
        ImmutableObj immutableObj2 = immutableObj1.add(20);

        System.out.println("immutableObj1 = " + immutableObj1.getValue());
        System.out.println("immutableObj2 = " + immutableObj2.getValue());
    }
}
