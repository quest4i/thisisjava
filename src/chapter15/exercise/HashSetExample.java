package chapter15.exercise;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by eluticaa on 2016-05-25.
 */
public class HashSetExample {

    public static void main(String[] args) {


        Set<Student> set = new HashSet<>();
        set.add(new Student(1, "Hong Gildong"));
        set.add(new Student(2, "Shin Yonggweon"));
        set.add(new Student(1, "Jo Minwoo"));


        Iterator<Student> iterator = set.iterator();
        Student student;
        while (iterator.hasNext()) {
            student = iterator.next();
            System.out.println(student.getStudentNum() + ":" + student.getName());
        }

    }
}
