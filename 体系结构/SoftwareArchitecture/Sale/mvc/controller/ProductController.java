package mvc.controller;

import mvc.model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.function.ToDoubleFunction;

/**
 * Created by troyeagle on 2/21/2016.
 */
public class ProductController {
    private List<Product> productList = new ArrayList<>();
    private ToDoubleFunction<Double> strategy = value -> value;

    public Product getNextProduct() {
        Product product = new Product();
        productList.add(product);
        return product;
    }

    public boolean hasProduct() {
        return true;
    }

    public List<Product> getProductList() {
        return new ArrayList<>(productList);
    }

    public void setStrategy(ToDoubleFunction<Double> strategy) {
        this.strategy = strategy;
    }

    public double getTotalPrice() {
        double sum = productList.stream().mapToDouble(Product::getPrice).sum();
        return strategy.applyAsDouble(sum);
    }

    public void record() {

    }
}
