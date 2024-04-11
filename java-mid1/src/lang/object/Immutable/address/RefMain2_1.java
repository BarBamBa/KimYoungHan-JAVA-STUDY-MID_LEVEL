package lang.object.Immutable.address;

public class RefMain2_1 {
    public static void main(String[] args) {
        //참조형 변수는 하나의 인스턴스를 공유 할 수 있다.
        ImmutableAddress a = new ImmutableAddress("서울");
        ImmutableAddress b = a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        System.out.println();

//        b.setValue("부산"); //불변객체를 참조중이므로 setter 불가능
        b = new ImmutableAddress("부산");
        System.out.println("b <- 부산");
        System.out.println("a = " + a);
        System.out.println("b = " + b);


    }
}
