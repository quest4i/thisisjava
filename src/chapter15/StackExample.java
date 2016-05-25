package chapter15;


import java.util.*;



/**
 * Created by eluticaa on 2016-05-24.
 */
public class StackExample {


    public static void main(String[] args) {

        Stack<Coin> coinBox = new Stack<>();

        coinBox.push(new Coin(100));
        coinBox.push(new Coin(50));
        coinBox.push(new Coin(90));
        coinBox.push(new Coin(10));
        coinBox.push(new Coin(80));
        coinBox.push(new Coin(1));


        Coin coin = null;
        while (!coinBox.isEmpty()) {
            coin = coinBox.pop();
            System.out.println(coin.getValue());
        }
    }
}
