package chapter15;


import java.util.Iterator;
import java.util.TreeSet;

/**
 * Created by eluticaa on 2016-05-24.
 */
public class ComparableExample {


    public static void main(String[] args) {

        TreeSet<Person> treeSet = new TreeSet<>();
        treeSet.add(new Person("Hong", 45));
        treeSet.add(new Person("Kim", 25));
        treeSet.add(new Person("Park", 31));


        Iterator<Person> iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
