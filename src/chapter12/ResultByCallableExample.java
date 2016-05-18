package chapter12;

/**
 * Created by eluticaa on 2016-05-18.
 */


import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


public class ResultByCallableExample {

    public static void main(String[] args) {


        ExecutorService executorService = Executors.newFixedThreadPool(
                Runtime.getRuntime().availableProcessors()
        );


        System.out.println("[ask for work]");
        Callable<Integer> task = new Callable<Integer>() {

            @Override
            public Integer call() throws Exception {
                int sum = 0;
                for (int i = 0; i <= 10; i++) {
                    sum += i;
                }

                return sum;
            }
        };
        Future<Integer> future = executorService.submit(task);


        try {
            int sum = future.get();
            System.out.println("[RESULT] " + sum);
            System.out.println("[Done...]");
        } catch (Exception e) {
            System.out.println("[runtime exception] " + e.getMessage());
        }


        executorService.shutdown();

    }
}
