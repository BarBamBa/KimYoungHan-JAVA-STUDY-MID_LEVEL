package lang.object.tostring;

import java.lang.reflect.Array;

public class ToStringMain1 {
    public static void main(String[] args) {
        Object object = new Object();
        String string = object.toString();

        System.out.println(object);

        System.out.println(string);
        System.out.println(object.toString().equals(string)); //true

    }

}
