package chapter16;


import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;



/**
 * Created by eluticaa on 2016-05-26.
 */
public class OptionalExample {


    public static void main(String[] args) {


        List<Integer> list = new ArrayList<>();
        double avg;


        // Java.util.NoShuchElementExecption
//        avg = list.stream()
//                .mapToInt(Integer :: intValue)
//                .average()
//                .getAsDouble();


        // Method 1
        OptionalDouble optional = list.stream()
                .mapToInt(Integer::intValue)
                .average();
        if (optional.isPresent()) {
            System.out.println("method1 avg : " + optional.getAsDouble());
        } else {
            System.out.println("method1 avg : 0.0");
        }

        // Method 2
        avg = list.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);
        System.out.println("method2 avg : " + avg);

        // Method 3
        list.stream()
                .mapToInt(Integer::intValue)
                .average()
                .ifPresent(a -> System.out.println("method3 avg : " + a));

    }
}
