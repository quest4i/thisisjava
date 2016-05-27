package chapter16;


import java.util.Arrays;
import java.util.stream.IntStream;


/**
 * Created by eluticaa on 2016-05-25.
 */
public class AsDoubleStreamAndBoxedExample {


    public static void main(String[] args) {

        int[] intArray = { 1, 2, 3, 4, 5 };

        IntStream intStream = Arrays.stream(intArray);
        intStream
                .asDoubleStream()
                .forEach(d -> System.out.println(d));

        System.out.println();


        intStream = Arrays.stream(intArray);
        intStream
                .boxed()
                .forEach(System.out::println);
    }
}
