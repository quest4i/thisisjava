package chapter16;


import java.util.Arrays;
import java.util.List;



/**
 * Created by eluticaa on 2016-05-26.
 */
public class MaleStudentExample {


    public static void main(String[] args) {

        List<Student2> totalList = Arrays.asList(
                new Student2("Hong", 10, Student2.Sex.MALE),
                new Student2("Gim", 6, Student2.Sex.FEMALE),
                new Student2("Shin", 10, Student2.Sex.MALE),
                new Student2("Park", 10, Student2.Sex.FEMALE)
        );


        MaleStudent maleStudent = totalList.stream()
                .filter(s -> s.getSex() == Student2.Sex.MALE)
                .collect(MaleStudent::new, MaleStudent::accumulate, MaleStudent::combine);

        maleStudent.getList().stream()
                .forEach(s -> System.out.println(s.getName()));
    }
}
