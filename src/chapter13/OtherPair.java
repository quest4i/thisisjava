package chapter13;

/**
 * Created by eluticaa on 2016-05-20.
 */
public class OtherPair<K, V> {

    private K key;
    private V value;

    public OtherPair(K key, V value) {

        this.key = key;
        this.value = value;
    }



    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

}
