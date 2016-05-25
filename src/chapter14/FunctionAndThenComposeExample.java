package chapter14;


import java.util.function.Function;

/**
 * Created by eluticaa on 2016-05-23.
 */
public class FunctionAndThenComposeExample {


    public static void main(String[] args) {


        Function<Member, Address> functionA;
        Function<Address, String> functionB;
        Function<Member, String> functionAB;

        String city;


        functionA = (m) -> m.getAddress();
        functionB = (m) -> m.getCity();

        functionAB = functionA.andThen(functionB);
        city = functionAB.apply(
                new Member("honggildong", "hong", new Address("korea", "seoul"))
        );
        System.out.println("living city : " + city);

        functionAB = functionB.compose(functionA);
        city = functionAB.apply(
                new Member("honggildong", "hong", new Address("korea", "seoul"))
        );
        System.out.println("living city : " + city);
    }


}
