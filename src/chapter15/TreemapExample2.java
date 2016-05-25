package chapter15;


import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;


/**
 * Created by eluticaa on 2016-05-24.
 */
public class TreemapExample2 {

    public static void main(String[] args) {

        TreeMap<Integer, String> scores = new TreeMap<>();
        scores.put(87, "Hong");
        scores.put(98, "Lee");
        scores.put(75, "Park");
        scores.put(95, "Sin");
        scores.put(80, "Gim");

        NavigableMap<Integer, String> descendingMap = scores.descendingMap();
        Set<Map.Entry<Integer, String>> descendingEntrySet = descendingMap.entrySet();
        for (Map.Entry<Integer, String> entry : descendingEntrySet) {
            System.out.println(entry);
        }
        System.out.println();


        NavigableMap<Integer, String> ascendingMap = descendingMap.descendingMap();
        Set<Map.Entry<Integer, String>> ascendingEntrySet = ascendingMap.entrySet();
        for (Map.Entry<Integer, String> entry : ascendingEntrySet) {
            System.out.println(entry);
        }


    }
}
