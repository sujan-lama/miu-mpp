package prob2.c;

import prob2.Product;

import java.util.*;

class ProductInfo {
    enum SortMethod {BYNAME, BYSALARY}

    public void sort(List<Product> productList, final SortMethod method) {
        class ProductComparator implements Comparator<Product> {
            @Override
            public int compare(Product e1, Product e2) {
                if (method == SortMethod.BYNAME) {
                    return e1.getTitle().compareTo(e2.getTitle());
                } else {
                    return Double.compare(e1.getPrice(), e2.getPrice());
                }
            }
        }
        productList.sort(new ProductComparator());
    }
}
