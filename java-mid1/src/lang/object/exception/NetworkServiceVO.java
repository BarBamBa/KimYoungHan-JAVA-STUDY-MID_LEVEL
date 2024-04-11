package lang.object.exception;

public class NetworkServiceVO {

    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientVO client = new NetworkClientVO(address);

        client.connect();
        client.send(data);
        client.disconnect();
    }
}
