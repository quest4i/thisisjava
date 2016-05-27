package chapter16;


import java.util.stream.IntStream;


/**
 * Created by eluticaa on 2016-05-25.
 */
public class FromIntRangeExample {


    public static int sum;


    public static void main(String[] args) {

        IntStream stream = IntStream.rangeClosed(1, 100);
        stream.forEach(a -> sum += a);
        System.out.println("total : " + sum);
    }
}
