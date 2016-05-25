package chapter15;


import java.util.*;

/**
 * Created by eluticaa on 2016-05-24.
 */
public class LinkedListExample {


    public static void main(String[] args) {

        List<String> list1 = new ArrayList<>();
        List<String> list2 = new LinkedList<>();

        long startTime;
        long endTime;

        startTime = System.nanoTime();
        for(int i = 0; i < 10000; i++) {
            list1.add(0, String.valueOf(i));
        }
        endTime = System.nanoTime();
        System.out.println("ArrayList spend time: " + (endTime-startTime) + " ns");

        startTime = System.nanoTime();
        for(int i = 0; i < 10000; i++) {
            list2.add(0, String.valueOf(i));
        }
        endTime = System.nanoTime();
        System.out.println("LinkedList spend time: " + (endTime-startTime) + " ns");

    }
}
