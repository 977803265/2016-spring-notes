package mainProgramSubroutine;

import mainProgramSubroutine.data.Member;
import mainProgramSubroutine.data.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.function.ToDoubleFunction;

/**
 * Created by troyeagle on 2/19/2016.
 */
public class MainProgramSubroutine {
    public static void main(String[] args) {
        Member member = getMember();
        showMemberInfo(member);

        List<Product> productList = new ArrayList<>();
        while (true) {
            Product product = getProduct();
            if (product == null) break;
            productList.add(product);
            showProductList(productList);
        }

        ToDoubleFunction<Double> strategy = value -> value;
        double totalPrice = countTotalPrice(productList, strategy);
        showTotalPrice(totalPrice);
        double payment = getPayment();
        double cash = payment - totalPrice;
        assert cash >= 0;
        showCash(cash);

        recordSellInfo(member, productList, strategy);
        updateStock(productList);
        updateMember(member);

        printReceipt(productList, totalPrice);
    }

    private static Member getMember() {
        return new Member();
    }

    private static Product getProduct() {
        return new Product();
    }

    private static void showProductList(List<Product> productList) {
        System.out.println(productList);
    }

    private static void showMemberInfo(Member member) {
        System.out.println(member);
    }

    private static double countTotalPrice(List<Product> productList, ToDoubleFunction<Double> strategy) {
        return strategy.applyAsDouble(productList.stream().mapToDouble(product -> product.price).sum());
    }

    private static void showTotalPrice(double totalPrice) {
        System.out.println("Total price: " + totalPrice);
    }

    private static double getPayment() {
        return 100.0;
    }

    private static void showCash(double cash) {
        System.out.println("Cash: " + cash);
    }

    private static void recordSellInfo(Member member, List<Product> productList, ToDoubleFunction<Double> strategy) {

    }

    private static void updateStock(List<Product> productList) {
        for (Product product : productList) product.stock--;
    }

    private static void updateMember(Member member) {

    }

    private static void printReceipt(List<Product> productList, double totalPrice) {

    }
}
