package chapter15;

import java.util.*;

/**
 * Created by eluticaa on 2016-05-24.
 */
public class HashSetExample {


    public static void main(String[] args) {

        Set<String> set = new HashSet<>();

        set.add("Java");
        set.add("JDBC");
        set.add("Servlet/JSP");
        set.add("Java");
        set.add("iBATIS");


        int size = set.size();
        System.out.println("Total objects : " + size);


        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println("\t" + element);
        }

        set.remove("JDBC");
        set.remove("iBATIS");
        size = set.size();
        System.out.println("Total objects : " + size);

        iterator = set.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println("\t" + element);
        }


        set.clear();
        if (set.isEmpty()) {
            System.out.println("empty");
        }
    }

}
