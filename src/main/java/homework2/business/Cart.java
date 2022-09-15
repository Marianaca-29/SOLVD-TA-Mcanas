package homework2.business;


import homework2.interfaces.FilterProduct;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Cart {

    private Logger logger = LogManager.getLogger(Cart.class.getSimpleName());

    //Using array list class
    // Remember is resizable
    private List<Product> listProduct;
    private Predicate<Product> productPredicate;

    // Creating an object ArrayList
    public Cart() {
        listProduct = new ArrayList<Product>();
    }

    //getters
    public List<Product> getListProduct() {

        return listProduct;
    }

    //adding the list of products to cart

    public void addProduct(Product oneProduct) {
        listProduct.add(oneProduct);

    }

    public void showCart() {
        for (Product item : listProduct) {
            item.toString();
            logger.info(item.toString());
        }

    }

    //Adding some intermediate operations

    public void productNamesToUpperCase() {
        List<String> namesToUpper = new ArrayList<>();
        for (int i = 0; i < listProduct.size(); i++) {
            namesToUpper.add(listProduct.get(i).getName());
        }
        namesToUpper.stream().map(String::toUpperCase).forEach(System.out::println);
    }

    public void productOrdered() {
        List<String> namesOrder = new ArrayList<>();
        for (int i = 0; i < listProduct.size(); i++) {
            namesOrder.add(listProduct.get(i).getName());
        }
        namesOrder.stream().sorted().forEach(System.out::println);
    }

    public void countCart() {
        listProduct.stream().count();
        logger.info(listProduct.stream().count());
    }


    public void getFieldOfProductsBy(FilterProduct filterProduct) {
        for (Product p : listProduct) {
            if (filterProduct.filteringProducts(p))
                logger.info("The selected product is: " + p.getName() + " and it's final price is " + p.getPrice());
        }
    }


}
