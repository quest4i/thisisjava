package chapter12;

/**
 * Created by eluticaa on 2016-05-16.
 */
public class ThreadStateExample {

    public static void main(String[] args) {

        StatePrintThread statePrintThread = new StatePrintThread(new TargetThread());
        statePrintThread.start();

    }

}
