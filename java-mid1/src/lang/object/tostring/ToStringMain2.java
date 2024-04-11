package lang.object.tostring;

public class ToStringMain2 {
    public static void main(String[] args) {
        Car car = new Car("Model Y");
        Dog dog1 = new Dog("멍멍이", 2);
        Dog dog2 = new Dog("멍멍이", 5);

        System.out.println("1. 단순 toString 호출");
        System.out.println(car.toString());
        System.out.println(dog1.toString());
        System.out.println(dog2.toString());

        System.out.println("2. println 내부에서 toString 호출");
        System.out.println(car); //println 내에 toString 메서드가 있다.
        System.out.println(dog1);
        System.out.println(dog2);

        System.out.println("3. Object 다형성 활용");
        ObjectPrinter.print(car); //자식인 Car에서 재정의된 toString이 없기때문에 Object 내의 toString 실행
        ObjectPrinter.print(dog1); //자식인 Dog에서 재정의된 toString이 있기 때문에 Dog 내의 재정의된 toString 실행
        ObjectPrinter.print(dog2);

        String refValue = Integer.toHexString(System.identityHashCode(dog1)); //toString을 재정의해 참조값을 알 수 없는 Dog클래스의 참조값을 구하는 방법
        System.out.println("refValue : " + refValue);

    }
}
