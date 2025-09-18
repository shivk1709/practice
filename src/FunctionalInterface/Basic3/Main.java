package FunctionalInterface.Basic3;

import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        List<Product> products = List.of(
                new Product(10, "Washing Machine"),
                new Product(20, "Hair Dryer"),
                new Product(5, "Roller")
        );

        CheckProductImpl checkProduct = new CheckProductImpl();
        var filteredProducts = checkProduct.filteredProducts(products, p -> p.getQuantity() > 5);
        filteredProducts.forEach(System.out::println);
    }
}
