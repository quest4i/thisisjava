package chapter15.exercise;


import java.util.TreeSet;



/**
 * Created by eluticaa on 2016-05-25.
 */
public class TreeSetExample {


    public static void main(String[] args) {

        TreeSet<Student2> treeSet = new TreeSet<Student2>();
        treeSet.add(new Student2("blue", 96));
        treeSet.add(new Student2("hong", 86));
        treeSet.add(new Student2("white", 92));


        Student2 student = treeSet.last();
        System.out.println("max score : " + student.score);
        System.out.println("id : " + student.id);
    }
}



class Student2 implements Comparable<Student2> {

    String id;
    int score;

    public Student2(String id, int score) {
        this.id = id;
        this.score = score;
    }


    @Override
    public int compareTo(Student2 o) {

        if (this.score > o.score) {
            return 1;
        } else if (this.score == o.score) {
            return 0;
        } else {
            return -1;
        }
    }
}
