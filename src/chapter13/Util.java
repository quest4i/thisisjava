package chapter13;

/**
 * Created by eluticaa on 2016-05-20.
 */
public class Util {

    public static <P extends Pair, V> int getValue(P p, V v) {

        if (p.getKey().equals(v)) {
            return (int) p.getValue();
        } else {
            return -1;
        }
    }

}
