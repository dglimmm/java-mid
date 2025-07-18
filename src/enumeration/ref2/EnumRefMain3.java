package enumeration.ref2;

public class EnumRefMain3 {

    public static void main(String[] args) {
        int price = 10_000;

        printDiscount(Grade.BASIC, price);
        printDiscount(Grade.GOLD, price);
        printDiscount(Grade.DIAMOND, price);

    }

    private static void printDiscount(Grade grade, int price){
        System.out.println(grade.name() + " 등급의 할인 금액: " + grade.discount(price));
    }
}
