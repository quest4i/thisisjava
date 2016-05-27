package chapter16;

import java.util.Arrays;

/**
 * Created by eluticaa on 2016-05-26.
 */
public class MatchExample {

    public static void main(String[] args) {

        int[] intArr = { 2, 4, 6 };

        boolean result = Arrays.stream(intArr)
                .allMatch(a -> a % 2 == 0);
        System.out.println("Is all a multiple of two ? " + result);


        result = Arrays.stream(intArr)
                .anyMatch(a -> a % 3 == 0);
        System.out.println("Is there a multiple of three at least one more ? " + result);


        result =  Arrays.stream(intArr)
                .noneMatch(a -> a % 3 == 0);
        System.out.println("Is not there a multiple of three ? " + result);

    }
}
