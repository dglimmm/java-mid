package lang.immutable.address;

public class MemberMainV2 {

    public static void main(String[] args) {
        ImmutableAddress address = new ImmutableAddress("서울");

        MemberV2 a = new MemberV2("회원A", address);
        MemberV2 b = new MemberV2("회원B", address);

        //회원 A, B 처음 주소는 서울
        System.out.println("memberA = "+ a);
        System.out.println("memberB = "+ b);

        //회원 B의 주소를 부산으로 변경
//        b.getAddress().setValue("부산");
        b.setAddress(new ImmutableAddress("부산"));
        System.out.println("부산 -> b.address");
        System.out.println("memberA = "+ a);
        System.out.println("memberB = "+ b);

    }
}
