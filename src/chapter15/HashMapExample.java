package chapter15;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;



/**
 * Created by eluticaa on 2016-05-24.
 */
public class HashMapExample {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        map.put("Shin", 85);
        map.put("Hong", 90);
        map.put("Dong", 80);
        map.put("Hong", 95);
        System.out.println("Total Entry number : " + map.size());

        System.out.println("Hong : " + map.get("Hong"));
        System.out.println();

        Set<String> keySet = map.keySet();
        Iterator<String> keyIterator = keySet.iterator();
        while (keyIterator.hasNext()) {
            String key = keyIterator.next();
            Integer value = map.get(key);
            System.out.println("\t" + key + " : " + value);
        }
        System.out.println();


        map.remove("Hong");
        System.out.println("Total entry number : " + map.size());

        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();

        while (entryIterator.hasNext()) {
            Map.Entry<String, Integer> entry = entryIterator.next();
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("\t" + key + " : " + value);
        }
        System.out.println();


        map.clear();
        System.out.println("total entry number : " + map.size());

    }

}

