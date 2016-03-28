package oo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.ToDoubleFunction;

/**
 * Created by troyeagle on 2/19/2016.
 */
public class ProductInput {
    private List<Product> productList = new ArrayList<>();
    private ToDoubleFunction<Double> strategy;

    public ProductInput(ToDoubleFunction<Double> strategy) {
        this.strategy = strategy;
    }

    public Product addNextProduct() throws Exception {
        Product product = new Product();
        productList.add(product);
        return product;
    }

    public double getTotalPrice() {
        return strategy.applyAsDouble(productList.stream().mapToDouble(Product::getPrice).sum());
    }

    public void updateStock() {
        productList.forEach(Product::consumeProduct);
    }

    public void record() {

    }

    public void printReceipt() {

    }
}
