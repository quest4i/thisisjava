package chapter14;


import java.util.function.IntBinaryOperator;

/**
 * Created by eluticaa on 2016-05-23.
 */
public class MethodReferencesExample {


    public static void main(String[] args) {

        IntBinaryOperator operator;


        operator = (x, y) -> Calculator.staticMethod(x, y);
        System.out.println("Result1: " + operator.applyAsInt(1, 2));


        operator = Calculator :: staticMethod;
        System.out.println("Result2: " + operator.applyAsInt(3, 4));


        Calculator obj = new Calculator();
        operator = (x, y) -> obj.instanceMethod(x, y);
        System.out.println("Result3: " + operator.applyAsInt(5, 6));
        operator = obj :: instanceMethod;
        System.out.println("Result4: " + operator.applyAsInt(7, 8));
    }
}
