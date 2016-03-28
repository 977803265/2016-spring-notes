package layer.business;

import layer.data.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by troyeagle on 2/26/2016.
 */
public class SellBusiness {
    public List<Product> getProductList() {
        return new ArrayList<>();
    }

    public double getTotalPrice() {
        return 100.0;
    }

    public double getPayment() {
        return 100.0;
    }

    public void record() {

    }
}
