package chapter15;

import java.util.*;


/**
 * Created by eluticaa on 2016-05-24.
 */
public class HashMapExample2 {

    public static void main(String[] args) {

        Map<Student, Integer> map = new HashMap<>();


        map.put(new Student(1, "Hong"), 95);
        map.put(new Student(1, "Hong"), 95);


        System.out.println("total entry number : " + map.size());
    }

}
