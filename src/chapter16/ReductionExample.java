package chapter16;


import java.util.Arrays;
import java.util.List;


/**
 * Created by eluticaa on 2016-05-26.
 */
public class ReductionExample {


    public static void main(String[] args) {

        List<Student> studentList = Arrays.asList(
                new Student("Hong", 92),
                new Student("Shin", 95),
                new Student("Gam", 88)
        );


        int sum1 = studentList.stream()
//                .mapToInt(Student::getScore)
                .mapToInt(Student::getScore)
                .sum();

        int sum2 = studentList.stream()
                .map(Student::getScore)
                .reduce((a, b) -> a+b)
                .get();


        int sum3 = studentList.stream()
                .map(Student :: getScore)
                .reduce(0, (a, b) -> a + b);

        System.out.println("sum1 : " + sum1);
        System.out.println("sum2 : " + sum2);
        System.out.println("sum3 : " + sum3);
    }
}
