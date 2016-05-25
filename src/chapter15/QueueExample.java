package chapter15;


import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by eluticaa on 2016-05-24.
 */
public class QueueExample {


    public static void main(String[] args) {

        Queue<Message> messageQueue = new LinkedList<>();
        messageQueue.offer(new Message("sendMail", "Hong"));
        messageQueue.offer(new Message("sendSMS", "Shin"));
        messageQueue.offer(new Message("sendKakaotalk", "Hong2"));


        while (!messageQueue.isEmpty()) {
            Message message = messageQueue.poll();
            switch (message.command) {
                case "sendMail":
                    System.out.println("mail to " + message.to);
                    break;
                case "sendSMS":
                    System.out.println("send a SMS to " + message.to);
                    break;
                case "sendKakaotalk":
                    System.out.println("send a kakaotalk message" + message.to);
                    break;
                default:
                    break;
            }
        }
    }
}
