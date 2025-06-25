package enumeration.ex0;

public class StringGradeEx0_1 {

    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();
        int basic = discountService.discount("BASIC", price);
        int gold = discountService.discount("GOLD", price);
        int diamond = discountService.discount("DIAMOND", price);
        
        //위와같이 grade를 하드코딩으로 넣는경우 오타, 등급잘못지정 등의 문제로 정상 값이 안나올 수 있다
        //타입 안정성 부족, 데이터 일관성 문제
        
        System.out.println("basic = " + basic);
        System.out.println("gold = " + gold);
        System.out.println("diamond = " + diamond);
    }
}
