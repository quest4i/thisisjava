package chapter14;


import java.util.function.IntPredicate;



/**
 * Created by eluticaa on 2016-05-23.
 */
public class PredicateAndOrNegateExample {


    public static void main(String[] args) {


        IntPredicate predicateA = a -> a % 2 == 0;
        IntPredicate predicateB = (a) -> a % 3 == 0;
        IntPredicate predicateAB;

        boolean result;

        predicateAB = predicateA.and(predicateB);
        result = predicateAB.test(9);
        System.out.println("Is 9 a multiple of 2 and 3 ? " + result);

        predicateAB = predicateA.or(predicateB);
        result = predicateAB.test(9);
        System.out.println("Is 9 a multiple of 2 or 3 ? " + result);

        predicateAB = predicateA.negate();
        result = predicateAB.test(9);
        System.out.println("Is 9 a odd number ? " + result);
    }
}
