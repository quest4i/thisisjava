package chapter16;


import java.util.Arrays;
import java.util.List;


/**
 * Created by eluticaa on 2016-05-25.
 */
public class MapExample {


    public static void main(String[] args) {

        List<Student> studentList = Arrays.asList(
                new Student("Hong", 10),
                new Student("Sin", 20),
                new Student("Yu", 30)
        );

        studentList.stream()
                .mapToInt(Student :: getScore)
                .forEach(score -> System.out.println(score));
    }
}
