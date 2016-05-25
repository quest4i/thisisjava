package chapter14;

/**
 * Created by eluticaa on 2016-05-23.
 */
public class Address {

    private String country;
    private String city;

    public Address(String country, String city) {
        this.country = country;
        this.city = city;
    }


    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }
}
