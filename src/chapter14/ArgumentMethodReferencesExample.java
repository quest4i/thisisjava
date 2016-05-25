package chapter14;


import java.util.function.ToIntBiFunction;


/**
 * Created by eluticaa on 2016-05-23.
 */
public class ArgumentMethodReferencesExample {

    public static void main(String[] args) {

        ToIntBiFunction<String, String> function;

        function = (a, b) -> a.compareToIgnoreCase(b);
        print(function.applyAsInt("Java8", "JAVA8"));

        function = String :: compareToIgnoreCase;
        print(function.applyAsInt("Java8", "JAVA8"));

    }


    public static void print(int order) {
        if (order < 0) {
            System.out.println("to be first order by dictionary");
        } else if (order == 0) {
            System.out.println("There are equal strings.");
        } else {
            System.out.println("to be after order by dictionary");
        }
    }
}
