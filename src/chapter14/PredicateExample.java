package chapter14;


import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;


/**
 * Created by eluticaa on 2016-05-23.
 */
public class PredicateExample {


    private static List<Student2> list = Arrays.asList(
            new Student2("hong gildong", "man", 90),
            new Student2("kim sunhuee", "woman", 90),
            new Student2("gam jaba", "man", 95),
            new Student2("bak hanna", "woman", 92)
    );


    public static double avg(Predicate<Student2> predicate) {

        int count = 0;
        int sum = 0;

        for (Student2 student : list) {
            if (predicate.test(student)) {
                count++;
                sum += student.getScore();
            }
        }

        return (double) sum / count;
    }


    public static void main(String[] args) {
        double maleAvg = avg( t -> t.getSex().equals("man"));
        System.out.println("man avg score : " + maleAvg);

        double femaleAvg = avg(t -> t.getSex().equals("woman"));
        System.out.println("woman avg score : " + femaleAvg);
    }
}
