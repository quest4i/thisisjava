package chapter15;

/**
 * Created by eluticaa on 2016-05-24.
 */
public class Student {

    public int sno;
    public String name;

    public Student(int sno, String name) {
        this.sno = sno;
        this.name = name;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;

        Student student = (Student) o;

        if (sno != student.sno) return false;
        return name.equals(student.name);

    }

    @Override
    public int hashCode() {
        int result = sno;
        result = result + name.hashCode();
        return result;
    }
}
