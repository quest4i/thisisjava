package chapter12;

/**
 * Created by eluticaa on 2016-05-18.
 */
public class ConsumerThread extends Thread {

    private DataBox dataBox;

    public ConsumerThread(DataBox dataBox) {
        this.dataBox = dataBox;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 3; i++) {
            String data = dataBox.getData();
        }
    }
}
