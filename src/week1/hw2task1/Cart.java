package week1.hw2task1;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    private List<Products> listproducts;

    public Cart() {
        listproducts = new ArrayList<Products>();
    }


    public void showCart() {
        for (Products item : listproducts) {
            item.toString();
        }
    }

    public void addProduct(Products oneProduct) {
        listproducts.add(oneProduct);

    }

    public Double totalAmount() {
        Double sumTotal = 0.0;

        for (Products list : listproducts) {

            sumTotal += list.calculatePrice();

        }
        return sumTotal;
    }

}

