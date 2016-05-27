package chapter16;


import java.util.Arrays;
import java.util.stream.IntStream;



/**
 * Created by eluticaa on 2016-05-26.
 */
public class AggregateExample {


    public static void main(String[] args) {

        int[] numbers = new int[] { 1, 2, 3, 4, 5 };

        long count = Arrays.stream(numbers)
                .filter(n -> n % 2 == 0)
                .count();
        System.out.println("count of multiple numbers of two : " + count);

        long sum = Arrays.stream(numbers)
                .filter(n -> n % 2 == 0)
                .sum();
        System.out.println("sum of multiple of two : " + sum);

        double avg = Arrays.stream(numbers)
                .filter(n -> n % 2 == 0)
                .average()
                .getAsDouble();
        System.out.println("avg : " + avg);

        int max = Arrays.stream(numbers)
                .filter(n -> n % 2 == 0)
                .max()
                .getAsInt();
        System.out.println("max : " + max);


        int min = Arrays.stream(numbers)
                .filter(n -> n % 2 == 0)
                .min()
                .getAsInt();
        System.out.println("min : " + min);


        int first = Arrays.stream(numbers)
                .filter(n -> n % 3 == 0)
                .findFirst()
                .getAsInt();
        System.out.println("the first multiple of three is : " + first);
    }

}
