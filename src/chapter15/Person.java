package chapter15;

/**
 * Created by eluticaa on 2016-05-24.
 */
public class Person implements Comparable {

    public String name;
    public int age;


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Object o) {

        Person p = (Person) o;
        if (age < p.age) {
            return -1;
        } else if (age == p.age) {
            return 0;
        } else
            return 1;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
