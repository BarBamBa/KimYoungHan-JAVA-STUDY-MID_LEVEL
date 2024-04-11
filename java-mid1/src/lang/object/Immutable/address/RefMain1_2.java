package lang.object.Immutable.address;

public class RefMain1_2 {
    public static void main(String[] args) {
        //참조형 변수는 하나의 인스턴스를 공유 할 수 있다.
        Address a = new Address("서울");
        Address b = new Address("서울");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        System.out.println();

        b.setValue("부산");
        System.out.println("b <- 부산");
        System.out.println("a = " + a);
        System.out.println("b = " + b);


    }
}
