package chapter13;

/**
 * Created by eluticaa on 2016-05-20.
 */
public interface Storage<T> {

        public void add(T item, int index);
        public T get(int index);

}
