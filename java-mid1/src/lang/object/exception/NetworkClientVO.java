package lang.object.exception;

public class NetworkClientVO {

    private String address;

    public NetworkClientVO(String address) {
        this.address = address;
    }

    public String connect() {
        System.out.println(address + "서버 연결 성공");
        return "success";
    }

    public String send(String data) {
        System.out.println(address + "서버에 데이터 전송: " + data);
        return "success";
    }

    public void disconnect() {
        System.out.println(address + "서버에 연결 해제: ");
    }


}
