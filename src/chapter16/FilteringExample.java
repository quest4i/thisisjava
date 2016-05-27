package chapter16;

import java.util.Arrays;
import java.util.List;



/**
 * Created by eluticaa on 2016-05-25.
 */
public class FilteringExample {


    public static void main(String[] args) {


        List<String> names = Arrays.asList("Hong", "Sin", "Gam", "Shin", "Sin");

        names.stream()
                .distinct()
                .forEach(System.out :: println);
        System.out.println();


        names.stream()
                .filter(n -> n.startsWith("S"))
                .forEach(n -> System.out.println(n));
        System.out.println();


        names.stream()
                .distinct()
                .filter(n -> n.startsWith("S"))
                .forEach(System.out :: println);
    }
}
