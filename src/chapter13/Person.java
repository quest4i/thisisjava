package chapter13;

/**
 * Created by eluticaa on 2016-05-19.
 */
public class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
