package exception.ex1;

public class NetworkServiceV1_2 {

    public void sendMessage(String data){
        String address = "http://example.com";
        NetworkClientV1 client = new NetworkClientV1(address);
        client.initError(data);

        String connectResult = client.connect();
        if(isError(connectResult)){
            System.out.println("[네트워크 오류 발생] 오류 코드: "+ connectResult);
            return;
        }

        String sendReslut = client.send(data);
        if(isError(sendReslut)){
            System.out.println("[네트워크 오류 발생] 오류 코드: "+ sendReslut);
            return;
        }
        client.disconnect();
    }

    private static boolean isError(String connectResult) {
        return !connectResult.equals("success");
    }
}
