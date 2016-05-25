package chapter15;


import java.util.*;


/**
 * Created by eluticaa on 2016-05-24.
 */
public class HashtableExample {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();

        map.put("spring", "12");
        map.put("summber", "123");
        map.put("fall", "1234");
        map.put("winter", "12345");


        Scanner scanner = new Scanner(System.in);


        while (true) {

            System.out.println("input id, password");
            System.out.println("id : ");
            String id = scanner.nextLine();
            System.out.println();

            System.out.println("password : ");
            String password = scanner.nextLine();
            System.out.println();


            if (map.containsKey(id)) {
                if (map.get(id).equals(password)) {
                    System.out.println("login success");
                    break;
                } else {
                    System.out.println("mismatch password");
                }
            } else {
                System.out.println("no exist id");
            }
        }
    }
}
