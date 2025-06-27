package exception.basic.unchecked;

public class Client {
    public void call(){
        throw new MyUncheckedException("ex");
        //uncheckedException 은 throws를 안해도 알아서 던져짐
    }
}
