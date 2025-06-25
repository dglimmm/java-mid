package enumeration.test.ex1;

public class AuthGradeMain1 {

    public static void main(String[] args) {
       /* System.out.println("grade="+ AuthGrade.GUEST.name()+", level="+AuthGrade.GUEST.getLevel()+", 설명="+AuthGrade.GUEST.getDescription());
        System.out.println("grade="+ AuthGrade.LOGIN.name()+", level="+AuthGrade.LOGIN.getLevel()+", 설명="+AuthGrade.LOGIN.getDescription());
        System.out.println("grade="+ AuthGrade.ADMIN.name()+", level="+AuthGrade.ADMIN.getLevel()+", 설명="+AuthGrade.ADMIN.getDescription());*/
        AuthGrade[] values = AuthGrade.values();
        for (AuthGrade grade : values) {
            System.out.println("grade="+ grade.name()+", level="+grade.getLevel()+", 설명="+grade.getDescription());
        }
    }
}
