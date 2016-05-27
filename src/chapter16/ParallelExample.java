package chapter16;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;


/**
 * Created by eluticaa on 2016-05-25.
 */
public class ParallelExample {


    public static void main(String[] args) {

        List<String> list = Arrays.asList(
                "Hong", "Sin", "Gam", "Ramda", "Park"
        );

        Stream<String> stream = list.stream();
//        stream.forEach(ParallelExample :: print);
        stream.forEach(s -> ParallelExample.print(s));

    }



    public static void print(String str) {
        System.out.println(str + " : " + Thread.currentThread().getName());
    }
}
