package week1.hw2task1;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    //Using array list class
    // Remember is resizable
    private List<Products> listproducts;

    // Creating an object ArrayList
    public Cart() {
        listproducts = new ArrayList<Products>();
    }


    //adding the list of products to cart
    public void showCart() {
        for (Products item : listproducts) {
            item.toString();
        }
    }

    public void addProduct(Products oneProduct) {
        listproducts.add(oneProduct);

    }

    // mtehod to calculate total amount of products in the cart
    public Double totalAmount() {
        Double sumTotal = 0.0;

        for (Products list : listproducts) {

            sumTotal += list.calculatePrice();

        }
        return sumTotal;
    }

}

