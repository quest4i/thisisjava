package chapter12;

/**
 * Created by eluticaa on 2016-05-18.
 */
public class WorkThread extends Thread {

    public WorkThread(ThreadGroup threadGroup, String threadName) {
        super(threadGroup, threadName);
    }


    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(getName() + " interrupted");
                break;
            }
        }

        System.out.println(getName() + " end ");
    }
}
