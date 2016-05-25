package chapter15;

import java.util.TreeSet;
import java.util.Iterator;

/**
 * Created by eluticaa on 2016-05-24.
 */
public class ComparatorExample {


    public static void main(String[] args) {

//        TreeSet<Fruit> treeSet = new TreeSet<>();
        TreeSet<Fruit> treeSet = new TreeSet<Fruit>(new DescendingComparator());
        treeSet.add(new Fruit("grape", 3000));
        treeSet.add(new Fruit("watermelon", 10000));
        treeSet.add(new Fruit("strawberry", 6000));

        Iterator<Fruit> iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
