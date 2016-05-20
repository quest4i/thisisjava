package chapter13;

/**
 * Created by eluticaa on 2016-05-20.
 */
public class Container<T> {

    private T data;

    public void set(T data) {
        this.data = data;
    }

    public T get() {
        return data;
    }

}
