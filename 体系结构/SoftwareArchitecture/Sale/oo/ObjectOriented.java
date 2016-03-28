package oo;

/**
 * Created by troyeagle on 2/19/2016.
 */
public class ObjectOriented {
    public static void main(String[] args) {
        Member member = new Member();
        System.out.println(member);

        ProductInput productInput = new ProductInput(value -> value);
        while (true) {
            try {
                Product product = productInput.addNextProduct();
                System.out.println(product);
            } catch (Exception ignored) {
                break;
            }
        }
        double totalPrice = productInput.getTotalPrice();
        double payment = getPayment();
        double cash = payment - totalPrice;
        System.out.println(cash);

        productInput.record();
        productInput.updateStock();
        member.update(totalPrice);
        productInput.printReceipt();
    }

    private static double getPayment() {
        return 100.0;
    }
}
