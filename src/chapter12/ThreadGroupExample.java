package chapter12;

/**
 * Created by eluticaa on 2016-05-18.
 */
public class ThreadGroupExample {

    public static void main(String[] args) {

        ThreadGroup myGroup = new ThreadGroup("myGroup");
        WorkThread workThreadA = new WorkThread(myGroup, "workThreadA");
        WorkThread workThreadB = new WorkThread(myGroup, "workThreadB");


        workThreadA.start();
        workThreadB.start();

        System.out.println("[ main thread group list() ]");
        ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
        mainGroup.list();
        System.out.println();
        System.out.println();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) { }

        System.out.println("[ myGroup thread group call interrup() ]");
        myGroup.interrupt();
    }
}
