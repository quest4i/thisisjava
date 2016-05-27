package chapter16;


import java.util.ArrayList;
import java.util.List;



/**
 * Created by eluticaa on 2016-05-26.
 */
public class MaleStudent {


    private List<Student2> list;


    public MaleStudent() {
        list = new ArrayList<>();
        System.out.println("[" + Thread.currentThread().getName() + "] MaleStudent()");
    }


    public void accumulate(Student2 student) {
        list.add(student);
        System.out.println("[" + Thread.currentThread().getName() + "] accumulate()");
    }


    public void combine(MaleStudent other) {
        list.addAll(other.getList());
        System.out.println("[" + Thread.currentThread().getName() + "] combine()");
    }


    public List<Student2> getList() {
        return list;
    }
}
