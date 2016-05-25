package chapter15;

/**
 * Created by eluticaa on 2016-05-24.
 */
public class Fruit {


    public String name;
    public int price;

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public Fruit(String name, int price) {
        this.name = name;
        this.price = price;
    }
}
