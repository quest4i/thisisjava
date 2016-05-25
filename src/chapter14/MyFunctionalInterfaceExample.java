package chapter14;

/**
 * Created by eluticaa on 2016-05-23.
 */
public class MyFunctionalInterfaceExample {

    public static void main(String[] args) {

        MyFunctionalInterface fi;

        fi = (x, y) -> {
            int result = x + y;

            return result;
        };
        System.out.println(fi.method(2, 5));

        fi = (x, y) -> x + y;
        System.out.println(fi.method(2, 5));

        fi = (x, y) -> MyFunctionalInterfaceExample.sum(x, y);
        System.out.println(fi.method(2, 5));
    }


    public static int sum(int x, int y) {
        return (x + y);
    }
}



