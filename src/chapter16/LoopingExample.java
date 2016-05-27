package chapter16;


import java.util.Arrays;

/**
 * Created by eluticaa on 2016-05-26.
 */
public class LoopingExample {


    public static void main(String[] args) {


        int[] intArr = { 1, 2, 3, 4, 5 };

        System.out.println("peek() last call");
        Arrays.stream(intArr)
                .filter( a -> a % 2 == 0 )
                .peek(n -> System.out.println(n));

        System.out.println("[final handleing method]");
        int total = Arrays.stream(intArr)
                .filter( a -> a % 2 == 0 )
                .peek(n -> System.out.println(n))
                .sum();
        System.out.println();

        System.out.println("[forEach() in last]");
        Arrays.stream(intArr)
                .filter( a -> a % 2 == 0 )
                .forEach( n -> System.out.println(n) );
    }

}
