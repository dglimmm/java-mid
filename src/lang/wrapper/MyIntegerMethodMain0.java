package lang.wrapper;

public class MyIntegerMethodMain0 {

    public static void main(String[] args) {
        int value = 10;
        int i1 = compareTo(value, 11);
        if(i1 == -1){
            System.out.println("value 가 target보다 작습니다.");
        }else if(i1 ==1){
            System.out.println("value 가 target보다 큽니다.");
        }else{
            System.out.println("둘이 같습니다.");
        }

    }

    public static int compareTo(int value, int target){
        if(value < target){
            return -1;
        }else if(value > target){
            return 1;
        }else {
            return 0;
        }
    }
}
