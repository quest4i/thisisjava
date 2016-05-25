package chapter15;


import java.util.NavigableSet;
import java.util.TreeSet;

/**
 * Created by eluticaa on 2016-05-24.
 */
public class TreeSetExample2 {


    public static void main(String[] args) {

        TreeSet<Integer> scores = new TreeSet<>();
        scores.add(87);
        scores.add(98);
        scores.add(75);
        scores.add(95);
        scores.add(80);


        NavigableSet<Integer> descendingSet = scores.descendingSet();
        for (int score : descendingSet) {
            System.out.println(score + " ");
        }
        System.out.println();

        NavigableSet<Integer> ascendingSet = descendingSet.descendingSet();
        for (int score : ascendingSet) {
            System.out.println(score + " ");
        }
    }
}
