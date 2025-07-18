package enumeration.ref2;

public class EnumRefMain4 {

    public static void main(String[] args) {
        int price = 10_000;
        Grade[] values = Grade.values();
        for (Grade grade : values) {
            printDiscount(grade , price);
        }
    }

    private static void printDiscount(Grade grade, int price){
        System.out.println(grade.name() + " 등급의 할인 금액: " + grade.discount(price));
    }
}
