package chapter15;


import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by eluticaa on 2016-05-24.
 */
public class ArraysAsListExample {


    public static void main(String[] args) {


        List<String> list1 = new ArrayList<String>(Arrays.asList("Hong Gildong", "Sin Yonggweon", "Gam jaba"));
        for (String name : list1) {
            System.out.println(name);
        }
        System.out.println(list1.getClass().getCanonicalName());
    }
}
