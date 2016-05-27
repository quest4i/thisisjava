package chapter16;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by eluticaa on 2016-05-25.
 */
public class FromCollectionExample {


    public static void main(String[] args) {

        List<Student> studentList = Arrays.asList(
                new Student("Hong", 10),
                new Student("Sin", 20),
                new Student("Yu", 30)
        );

        Stream<Student> stream = studentList.stream();
        stream.forEach(s -> System.out.println(s.getName()));
    }
}
