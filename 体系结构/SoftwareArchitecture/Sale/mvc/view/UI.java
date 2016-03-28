package mvc.view;

import mvc.controller.MemberController;
import mvc.controller.PaymentController;
import mvc.controller.ProductController;
import mvc.model.Member;

/**
 * Created by troyeagle on 2/21/2016.
 */
public class UI {
    public static void main(String[] args) {
        MemberController memberController = new MemberController();
        Member member = memberController.getMember();
        System.out.println(member);

        ProductController productController = new ProductController();
        while (productController.hasProduct()) {
            productController.getNextProduct();
            System.out.println(productController.getProductList());
        }

        double totalPrice = productController.getTotalPrice();
        System.out.println("Total price: " + totalPrice);

        PaymentController paymentController = new PaymentController();
        double payment = paymentController.getPayment();

        double cash = payment - totalPrice;
        assert cash >= 0;
        System.out.println("Cash: " + cash);

        productController.record();
        memberController.update();
    }
}
