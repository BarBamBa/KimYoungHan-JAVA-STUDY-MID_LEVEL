package lang.object.poly;

public class ObjectPolyExample1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();

        action(dog);
        action(car);
    }
    private static void action(Object obj) {
//        obj.sound(); //컴파일 오류, Object클래스는 sound()가 없다.
//        obj.move(); //컴파일 오류, Object클래스는 move()가 없다.

        // 부모는 자식 Method 참조 불가 자식은 부모 Method참조 가능
        // 객체에 맞는 다운캐스팅이 필요
        if( obj instanceof Dog) {
            ((Dog)obj).sound();
        } else if (obj instanceof Car car) {
            car.move();
        }
    }
}
