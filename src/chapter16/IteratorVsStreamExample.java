package chapter16;


import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;


/**
 * Created by eluticaa on 2016-05-25.
 */
public class IteratorVsStreamExample {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("Hong", "Shin", "Gam");


        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }

        System.out.println( );

        Stream<String> stream = list.stream();
        stream.forEach( name -> System.out.println(name) );
    }
}
