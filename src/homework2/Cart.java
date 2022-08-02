package homework2;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    //Using array list class
    // Remember is resizable
    private List<Product> listProduct;

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
        }
    }


}

