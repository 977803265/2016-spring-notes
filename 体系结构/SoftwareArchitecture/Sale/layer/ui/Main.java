package layer.ui;

import layer.business.SellBusiness;
import layer.business.UserBusiness;
import layer.data.Member;
import layer.data.Product;

import java.util.List;

/**
 * Created by troyeagle on 2/26/2016.
 */
public class Main {
    public static void main(String[] args) {
        UserBusiness userBusiness = new UserBusiness();
        Member member = userBusiness.getMember();
        System.out.println(member);

        SellBusiness sellBusiness = new SellBusiness();
        List<Product> productList = sellBusiness.getProductList();
        productList.forEach(System.out::println);

        double totalPrice = sellBusiness.getTotalPrice();
        double payment = sellBusiness.getPayment();
        double cash = payment - totalPrice;
        assert cash >= 0;

        System.out.println("Cash: " + cash);
        sellBusiness.record();
    }
}
