package chapter14.excercize;


import java.util.function.ToIntFunction;



/**
 * Created by eluticaa on 2016-05-23.
 */
public class Exec6 {


    private static Student[] students = {
            new Student("Hong Gildong", 90, 96),
            new Student("Sin Yonggweon", 95, 93)
    };


    // avg() method
    public static double avg(ToIntFunction<Student> func) {

        int sum = 0;
        for (Student student : students) {
            sum += func.applyAsInt(student);
        }
        double avgScore = sum / students.length;

        return avgScore;
    }


    public static void main(String[] args) {

        double englishAvg = avg(Student::getEnglishScore);
        System.out.println("English avg score : " + englishAvg);

        double mathAvg = avg(Student::getMathScore);
        System.out.println("Math avg score : " + mathAvg);

    }




    public static class Student {

        private String name;
        private int englishScore;
        private int mathScore;


        public Student(String name, int englishScore, int mathScore) {
            this.name = name;
            this.englishScore = englishScore;
            this.mathScore = mathScore;
        }

        public String getName() {
            return name;
        }

        public int getEnglishScore() {
            return englishScore;
        }

        public int getMathScore() {
            return mathScore;
        }
    }
}
