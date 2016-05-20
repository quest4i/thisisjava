package chapter13;

/**
 * Created by eluticaa on 2016-05-20.
 */
public class ChildProduct<T, M, C> extends Product<T, M> {

    private C company;

    public C getCompany() {
        return this.company;
    }

    public void setCompany(C company) {
        this.company = company;
    }
}
