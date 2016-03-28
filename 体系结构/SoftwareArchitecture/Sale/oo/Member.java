package oo;

/**
 * Created by troyeagle on 2/19/2016.
 */
public class Member {
    private int id;
    private Object info;

    public int getId() {
        return id;
    }

    public Object getInfo() {
        return info;
    }

    public void update(double totalPrice) {

    }

    @Override
    public String toString() {
        return "Member{" +
                "id=" + id +
                ", info=" + info +
                '}';
    }
}
