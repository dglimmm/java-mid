package exception.ex4;

public class NetworkServiceV5 {

    public void sendMessage(String data) {
        String address = "http://example.com";

        try (NetworkClientV5 client = new NetworkClientV5(address)){ //AutoCloseable 은 try밖을 빠져나가는 순간close를 호출한다
            client.initError(data);
            client.connect();
            client.send(data);
        }catch (Exception e){
            System.out.println("[예외 확인]: "+ e.getMessage());
            throw e;
        }
    }
}
