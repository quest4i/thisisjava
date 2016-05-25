package chapter15;


import java.util.Map;
import java.util.TreeMap;


/**
 * Created by eluticaa on 2016-05-24.
 */
public class TreeMapExample1 {

    public static void main(String[] args) {

        TreeMap<Integer, String> scores = new TreeMap<>();
        scores.put(87, "Hong");
        scores.put(98, "Lee");
        scores.put(75, "Park");
        scores.put(95, "Sin");
        scores.put(80, "Gim");


        Map.Entry<Integer, String> entry = null;
        entry = scores.firstEntry();
        System.out.println("first " + entry.getKey() + " : " + entry.getValue());
        entry = scores.lastEntry();
        System.out.println("last " + entry.getKey() + " : " + entry.getValue());
        entry = scores.lowerEntry(80);
        System.out.println("lower 80 " + entry.getKey() + " : " + entry.getValue());
        entry = scores.higherEntry(90);
        System.out.println("higher 90 " + entry.getKey() + " : " + entry.getValue());
        entry = scores.floorEntry(95);
        System.out.println("floor 95 " + entry.getKey() + " : " + entry.getValue());
        entry = scores.ceilingEntry(85);
        System.out.println("ceiling 85 " + entry.getKey() + " : " + entry.getValue());


        while (!scores.isEmpty()) {
            entry = scores.pollFirstEntry();
            System.out.println(entry);
        }

    }

}
