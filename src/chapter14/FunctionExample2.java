package chapter14;


import java.util.Arrays;
import java.util.List;
import java.util.function.ToIntFunction;


/**
 * Created by eluticaa on 2016-05-23.
 */
public class FunctionExample2 {


    private static List<Student> list = Arrays.asList(
            new Student("hong gildong", 90, 96),
            new Student("sin yonggweon", 95, 93)
    );


    public static double avg(ToIntFunction<Student> function) {

        int sum = 0;

        for (Student student : list) {
            sum += function.applyAsInt(student);
        }
        double avg = (double) sum / list.size();

        return avg;
    }

    public static void main(String[] args) {

        double englishAvg = FunctionExample2.avg(s -> s.getEnglishScore());
        System.out.println("English Average Score : " + englishAvg);

        double mathAvg = FunctionExample2.avg(s -> s.getMathScore());
        System.out.println("Math Average Score : " + mathAvg);
    }
}
