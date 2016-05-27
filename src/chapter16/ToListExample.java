package chapter16;


import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Created by eluticaa on 2016-05-26.
 */
public class ToListExample {


    public static void main(String[] args) {


        List<Student2> totalList = Arrays.asList(
                new Student2("Hong", 10, Student2.Sex.MALE),
                new Student2("Gim", 6, Student2.Sex.FEMALE),
                new Student2("Sin", 10, Student2.Sex.MALE),
                new Student2("Pak", 6, Student2.Sex.FEMALE)
        );

        Set<Student2> set = new HashSet<>();
        set.addAll(totalList);
        System.out.println(set);


        List<Student2> maleList = totalList.stream()
                .filter(s -> s.getSex() == Student2.Sex.MALE)
                .collect(Collectors.toList());

        maleList.stream()
                .forEach(s -> System.out.println(s.getName()));



        System.out.println();



        Set<Student2> femaleList = totalList.stream()
                .filter(s -> s.getSex() == Student2.Sex.FEMALE)
                .collect(Collectors.toCollection(HashSet::new));

        femaleList.stream()
                .forEach(s -> System.out.println(s.getName()));





    }
}
