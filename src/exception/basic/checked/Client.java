package exception.basic.checked;

public class Client {
    public void call() throws MyCheckedException{ //발생시킨 예외를 밖으로 던진다는 뜻

        //문제 상황
        throw new MyCheckedException("ex");
    }
}
