package prob2.a;

import prob2.Product;

import java.util.Comparator;

public class PriceComparator implements Comparator<Product> {
    @Override
    public int compare(Product product1, Product product2) {
        return (int) (product1.getPrice() - product2.getPrice());
    }
}
