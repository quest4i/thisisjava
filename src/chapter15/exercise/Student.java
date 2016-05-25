package chapter15.exercise;

/**
 * Created by eluticaa on 2016-05-25.
 */
public class Student {


    private int studentNum;
    private String name;


    public Student(int studentNum, String name) {
        this.studentNum = studentNum;
        this.name = name;
    }


    public int getStudentNum() {
        return studentNum;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;

        Student student = (Student) o;

        if (studentNum != student.studentNum)
            return false;
        else
            return true;

//      return name.equals(student.name);

    }

    @Override
    public int hashCode() {
        int result = studentNum;
//      result = 31 * result + name.hashCode();
        return result;
    }
}
