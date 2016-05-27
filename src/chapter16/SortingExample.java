package chapter16;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;





/**
 * Created by eluticaa on 2016-05-25.
 */
public class SortingExample {


    public static void main(String[] args) {

        IntStream intStream = Arrays.stream(new int[] { 5, 3, 2, 1, 4 });
        intStream
                .sorted()
                .forEach(n -> System.out.print(n + ", "));
        System.out.println( );


        List<Student> studentList = Arrays.asList(
                new Student("Hong", 30),
                new Student("Sin", 10),
                new Student("Yu", 20)
        );

        studentList.stream()
                .sorted()
                .forEach(s -> System.out.print(s.getScore() + ", "));
        System.out.println();

        studentList.stream()
                .sorted( Comparator.reverseOrder() )
                .forEach( s -> System.out.print(s.getScore() + ", ") );


    }



}
