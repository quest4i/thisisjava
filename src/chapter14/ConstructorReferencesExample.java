package chapter14;


import java.util.function.BiFunction;
import java.util.function.Function;


/**
 * Created by eluticaa on 2016-05-23.
 */
public class ConstructorReferencesExample {

    public static void main(String[] args) {

        Function<String, Member> function1 = Member::new;
        Member member1 = function1.apply("angel");

        BiFunction<String, String, Member> function2 = Member::new;
        Member member2 = function2.apply("new angel", "angel");
    }

}
