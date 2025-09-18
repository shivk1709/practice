package FunctionalInterface.Basic3;

import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.List;

public class CheckProductImpl
{
    public List<Product> filteredProducts(List<Product> products, CheckProduct checkProduct)
    {
        List<Product> output = new ArrayList<>();
        for (Product product : products)
        {
            if (checkProduct.customFilter(product))
            {
                output.add(product);
            }
        }
        return output;
    }
}
