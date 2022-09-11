package homework2.interfaces;

import homework2.business.Product;

@FunctionalInterface

public interface FilterProduct {
    boolean filteringProducts(Product product);
}
