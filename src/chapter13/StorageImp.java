package chapter13;

/**
 * Created by eluticaa on 2016-05-20.
 */
public class StorageImp<T> implements Storage<T> {

    private T[] array;

    public StorageImp(int capacity) {
        this.array = (T[])(new Object[capacity]);
    }


    @Override
    public void add(T item, int index) {
        array[index] = item;
    }


    @Override
    public T get(int index) {
        return array[index];
    }
}
