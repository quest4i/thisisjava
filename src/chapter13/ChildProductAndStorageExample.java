package chapter13;

/**
 * Created by eluticaa on 2016-05-20.
 */
public class ChildProductAndStorageExample {

    public static void main(String[] args) {

        ChildProduct<Tv, String, String> product = new ChildProduct<>();

        product.setKind(new Tv());
        product.setModel("StartTV");
        product.setCompany("Samsung");

        Storage<Tv> storage = new StorageImp<Tv>(100);
        storage.add(new Tv(), 0);
        Tv tv = storage.get(0);
    }
}
