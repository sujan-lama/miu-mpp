package prob2.b;

import prob2.Product;

import java.util.Comparator;

public class TitleComparator implements Comparator<Product> {
    @Override
    public int compare(Product product1, Product product2) {
        return product1.getTitle().compareTo(product2.getTitle());
    }
}
