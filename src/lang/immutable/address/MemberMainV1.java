package lang.immutable.address;

public class MemberMainV1 {

    public static void main(String[] args) {
        Address address = new Address("서울");

        MemberV1 a = new MemberV1("회원A", address);
        MemberV1 b = new MemberV1("회원B", address);

        //회원 A, B 처음 주소는 서울
        System.out.println("memberA = "+ a);
        System.out.println("memberB = "+ b);

        //회원 B의 주소를 부산으로 변경
        b.getAddress().setValue("부산");
        System.out.println("부산 -> b.address");
        System.out.println("memberA = "+ a);
        System.out.println("memberB = "+ b);

    }
}
