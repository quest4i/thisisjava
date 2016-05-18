package chapter12;

import java.util.concurrent.*;

/**
 * Created by eluticaa on 2016-05-18.
 */
public class CompletionServiceExample {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(
                Runtime.getRuntime().availableProcessors()
        );

        CompletionService<Integer> completionService =
                new ExecutorCompletionService<Integer>(executorService);

        System.out.println("[ask for work]");
        for (int i = 0; i < 3; i++) {

            completionService.submit(new Callable<Integer>() {

                @Override
                public Integer call() throws Exception {

                    int sum = 0;
                    for (int j = 0; j <= 10; j++) {
                        sum += j;
                    }

                    return sum;
                }
            });
        }

        System.out.println("[check]");
        executorService.submit(new Runnable() {

            @Override
            public void run() {
                while (true) {
                    try {
                        Future<Integer> future = completionService.take();
                        int value = future.get();
                        System.out.println("[RESULT] " + value);
                    } catch (Exception e) {
                        break;
                    }
                }
            }
        });


        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            ;;
        }


        executorService.shutdownNow();
    }

}
