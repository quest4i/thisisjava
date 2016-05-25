package chapter14;


import java.util.function.IntBinaryOperator;

/**
 * Created by eluticaa on 2016-05-23.
 */
public class OperatorExample {


    private static int[] scores = { 92, 95, 87 };


    public static int maxOrMin(IntBinaryOperator operator) {

        int result = scores[0];

        for (int score : scores) {
            result = operator.applyAsInt(result, score);
        }

        return result;
    }

    public static void main(String[] args) {

        int max = maxOrMin( (a, b) -> {
                if (a >= b) {
                    return a;
                } else {
                    return b;
                }
            }
        );
        System.out.println("max value : " + max);

        int min = maxOrMin( (a, b) -> {
                if (a <= b) {
                    return a;
                } else {
                    return b;
                }
        });
        System.out.println("min value : " + min);


    }
}
