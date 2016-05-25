package chapter15.exercise;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;


/**
 * Created by eluticaa on 2016-05-25.
 */
public class MapExample {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("blue", 96);
        map.put("hong", 86);
        map.put("white", 92);


        String name = null;             // person have the largest score
        int maxScore = 0;
        int totalScore = 0;

        Set<String> setKey = map.keySet();
        Iterator<String> iterator = setKey.iterator();
        String key;
        while (iterator.hasNext()) {
            key = iterator.next();
            int value = map.get(key);
            totalScore += value;
            if (maxScore < value) {
                maxScore = value;
                name = key;
            }
        }
        System.out.println("avg score: " + totalScore / map.size());
        System.out.println("max score: " + maxScore);
        System.out.println("id of max score: " + name);

    }
}

