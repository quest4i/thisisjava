package chapter12; /**
 * Created by eluticaa on 2016-05-18.
 */

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


public class NoResultExample {


    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(
                Runtime.getRuntime().availableProcessors()
        );


        System.out.println("[Ask for work]");
        Runnable runnable = new Runnable() {

            @Override
            public void run() {
                int sum = 0;
                for (int i = 0; i < 10; i++) {
                    sum += i;
                }

                System.out.println("[RESULT] " + sum);
            }
        };
        Future future = executorService.submit(runnable);

        try {
            future.get();
            System.out.println("[Done...]");
        } catch (Exception e) {
            System.out.println("[occurred runtime exception] " + e.getMessage());
        }

        executorService.shutdown();
    }
}
