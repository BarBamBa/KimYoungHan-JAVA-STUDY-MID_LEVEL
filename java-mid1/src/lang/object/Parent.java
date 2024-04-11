package lang.object;

//상속한 부모클래스가 없으면 묵시적으로 Object 클래스를 상속받는다.(extends Object를 한 것과 같다.)
public class Parent {
    public void parentMethod() {
        System.out.println("Parent.parentMethod");
    }
}
