package chapter16;


import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by eluticaa on 2016-05-25.
 */
public class StreamPipelinesExample {

    public static void main(String[] args) {

        List<Member> list = new ArrayList<Member>(Arrays.asList(
                new Member("Hong", Member.MALE, 30),
                new Member("Kim", Member.FEMALE, 20),
                new Member("Sin", Member.MALE, 45),
                new Member("Park", Member.FEMALE, 27)
        ));

        double ageAvg = list.stream()
                .filter(m -> m.getSex() == Member.MALE)
                .mapToInt(Member :: getAge)
                .average()
                .getAsDouble();

        System.out.println("Mail avg age : " + ageAvg);
    }
}
