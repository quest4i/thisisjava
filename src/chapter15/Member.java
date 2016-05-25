package chapter15;

/**
 * Created by eluticaa on 2016-05-24.
 */
public class Member {

    public String name;
    public int age;

    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Member)) return false;

        Member member = (Member) o;

        if (age != member.age) return false;
        return name.equals(member.name);
    }

    @Override
    public int hashCode() {

        int result = name.hashCode();
        result = result + age;

        return result;
    }
}
