package chapter16;


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


/**
 * Created by eluticaa on 2016-05-26.
 */
public class GroupingByExample {


    public static void main(String[] args) {


        List<Student2> totalList = Arrays.asList(
                new Student2("Hong", 10, Student2.Sex.MALE, Student2.City.Seoul),
                new Student2("Kim", 6, Student2.Sex.FEMALE, Student2.City.Pusan),
                new Student2("Sin", 10, Student2.Sex.MALE, Student2.City.Pusan),
                new Student2("Park", 6, Student2.Sex.FEMALE, Student2.City.Seoul)
        );


        Map<Student2.Sex, List<Student2>> mapBySex = totalList.stream()
                .collect(Collectors.groupingBy(Student2::getSex));
        System.out.print("[MALE] ");
        mapBySex.get(Student2.Sex.MALE).stream()
                .forEach(s -> System.out.print(s.getName() + " "));
        System.out.println();
        System.out.print("[FEMALE] ");
        mapBySex.get(Student2.Sex.FEMALE).stream()
                .forEach(s -> System.out.print(s.getName() + " "));

        System.out.println();


        Map<Student2.City, List<String>> mapByCity = totalList.stream()
                .collect(
                        Collectors.groupingBy(
                                Student2::getCity,
                                Collectors.mapping(Student2::getName, Collectors.toList())
                        )
                );

        System.out.print("[Seoul] ");
        mapByCity.get(Student2.City.Seoul)
                .stream()
                .forEach(s -> System.out.print(s + " "));
        System.out.println();
        System.out.print("[Pusan] ");
        mapByCity.get(Student2.City.Pusan)
                .stream()
                .forEach(s -> System.out.print(s + " "));
    }
}
