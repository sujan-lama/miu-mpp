package prob2.b;

import prob2.Product;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Product> productList = Arrays.asList(
                new Product("product 1", 5000.0, 1),
                new Product("product 2", 2000.0, 2),
                new Product("product 3", 1000.0, 3),
                new Product("product 4", 14000.0, 4),
                new Product("product 5", 53000.0, 5),
                new Product("product 6", 11000.0, 6)
        );

        productList.sort(new TitleComparator());
        System.out.println("Product = " + productList);
    }
}
