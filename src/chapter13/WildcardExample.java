package chapter13;


import java.util.Arrays;




/**
 * Created by eluticaa on 2016-05-19.
 */
public class WildCardExample {


    public static void registerCourse(Course<?> course) {
        System.out.println(course.getName() + " 수강생: " +
            Arrays.toString(course.getStudents()));
    }


    public static void registerCourseStudent(Course<? extends Student> course) {
        System.out.println(course.getName() + " 수강생: " +
            Arrays.toString(course.getStudents()));
    }

    public static void registerCourseWorker(Course<? extends Worker> course) {
        System.out.println(course.getName() + " 수강생: " +
            Arrays.toString(course.getStudents()));
    }


    public static void main(String[] args) {

        Course<Person> personCourse = new Course<Person>("일반과정", 5);
        personCourse.add(new Person("일반인"));
        personCourse.add(new Person("Salaryman"));
        personCourse.add(new Person("student"));
        personCourse.add(new Person("high school student"));


        registerCourse(personCourse);
    }

}
