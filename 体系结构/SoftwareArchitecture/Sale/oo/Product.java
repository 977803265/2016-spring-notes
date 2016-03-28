package oo;

/**
 * Created by troyeagle on 2/19/2016.
 */
public class Product {
    private int id;
    private int stock;
    private int price;

    public int getId() {
        return id;
    }

    public int getStock() {
        return stock;
    }

    public int getPrice() {
        return price;
    }

    public void consumeProduct() { stock--; }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", stock=" + stock +
                ", price=" + price +
                '}';
    }
}
