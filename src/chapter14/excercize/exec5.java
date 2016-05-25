package chapter14.excercize;


import java.util.function.IntBinaryOperator;

/**
 * Created by eluticaa on 2016-05-23.
 */
public class Exec5 {

    private static int[] scores = { 10, 50, 3 };


    public static int maxOrMin(IntBinaryOperator operator) {

        int result = scores[0];
        for (int score : scores) {
            result = operator.applyAsInt(result, score);
        }
        return result;
    }


    public static void main(String[] args) {

        int max = maxOrMin(
                (a, b) -> {
                    if (a >= b) {
                        return a;
                    } else {
                        return b;
                    }
                }
        );
        System.out.println("Max value : " + max);

        int min = maxOrMin(
                (a, b) -> {
                    if (a >= b) {
                        return b;
                    } else {
                        return a;
                    }
                }
        );
        System.out.println("Min value : " + min);
    }

}
