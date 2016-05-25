package chapter15;

import java.util.*;


/**
 * Created by eluticaa on 2016-05-24.
 */
public class HashSetExample2 {


    public static void main(String[] args) {

        Set<Member> set = new HashSet<>();

        set.add(new Member("Hong Gildong", 30));
        set.add(new Member("Hong Gildong", 30));


        System.out.println("total object number : " + set.size());
    }
}
