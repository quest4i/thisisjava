package chapter16;


import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;


/**
 * Created by eluticaa on 2016-05-25.
 */
public class FromArrayExample {


    public static void main(String[] args) {

        String[] strArray = { "Hong", "Sin", "Gim" };
        Stream<String> strStream = Arrays.stream(strArray);
        strStream.forEach(a -> System.out.print(a + ", "));
        System.out.println( );

        int[] intArray = { 1, 2, 3, 4, 5 };
        IntStream intStream = Arrays.stream(intArray);
        intStream.forEach(a -> System.out.print(a + ", "));
        System.out.println();
    }
}
