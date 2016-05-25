package chapter15;


import java.util.TreeSet;



/**
 * Created by eluticaa on 2016-05-24.
 */
public class TreeSetExample1 {


    public static void main(String[] args) {

        TreeSet<Integer> scores = new TreeSet<>();

        scores.add(new Integer(87));
        scores.add(98);
        scores.add(75);
        scores.add(95);
        scores.add(80);

        int score = scores.first();
        System.out.println("the smallest number : " + score);

        score = scores.last();
        System.out.println("the biggest number : " + score);

        score = scores.lower(95);
        System.out.println("under 95 : " + score);

        score = scores.higher(95);
        System.out.println("upper 95 : " + score);

        score = scores.floor(95);
        System.out.println("equal or under 95 : " + score);

        score = scores.ceiling(85);
        System.out.println("equal or upper 85 : " + score);

        while (!scores.isEmpty()) {
            score = scores.pollFirst();
            System.out.println(score + "(remaining object number : " + scores.size());
        }
    }
}
