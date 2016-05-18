package chapter12; /**
 * Created by eluticaa on 2016-05-18.
 */



import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;


public class ExecuteExample {


    public static void main(String[] args) throws Exception {

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        for (int i = 0; i < 10; i++) {

            Runnable runnable = new Runnable() {

                @Override
                public void run() {

                    ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) executorService;
                    int poolSize = threadPoolExecutor.getPoolSize();
                    String threadName = Thread.currentThread().getName();
                    System.out.println("[total thread number : " + poolSize + "] working thread name: " + threadName);

                    int value = Integer.parseInt("삼");
                }
            };

//            executorService.execute(runnable);
            executorService.submit(runnable);


            Thread.sleep(10);
        }

        executorService.shutdown();
    }
}
