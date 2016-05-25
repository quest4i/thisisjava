package chapter14;


import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;


/**
 * Created by eluticaa on 2016-05-23.
 */
public class FunctionExample1 {


    private static List<Student> list = Arrays.asList(
            new Student("honggildong", 90, 96),
            new Student("shinyonggweon", 95, 93)
    );

    public static void printString(Function<Student, String> function) {

        for (Student student : FunctionExample1.list) {
            System.out.print(function.apply(student) + " ");
        }
        System.out.println();
    }

    public static void printInt(ToIntFunction<Student> function) {

        for (Student student : FunctionExample1.list) {
            System.out.print(function.applyAsInt(student) + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {


        System.out.println("[student name]");
        printString(t -> t.getName());

        System.out.println("[English Score]");
        printInt(t -> t.getEnglishScore());

        System.out.println("[Math Score]");
        printInt(t -> t.getMathScore());
    }
}
