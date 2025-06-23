package lang.object.tostring;

public class ToStringMain1 {

    public static void main(String[] args) {
        Object object = new Object();
        String string = object.toString();

        //tostring 출력
        System.out.println("string = " + string);
        //object 출력
        System.out.println(object);
        
        //println 은 tostring() 을 호출함

    }
}
