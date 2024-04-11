package lang.object.equals;

public class EqualsMainV1 {
    public static void main(String[] args) {
        UserV1 user1 = new UserV1("id-100");
        UserV1 user2 = new UserV1("id-100");

        System.out.println("identity = " + (user1 == user2)); //false : 참조값을 비교하기에 서로 다른 생성자로 생성된 객체인 user1 과 2는 다른 참조값을 가진다.
        System.out.println("identity = " + (user1.equals(user2))); // false : equals() 는 변수를 ==로 비교하는 메서드이기에 위의 ==로 비교하는 것과 마찬가지이다.
    }
}
