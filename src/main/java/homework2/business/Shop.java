package homework2.business;

import homework2.customer.Customer;

public class Shop {

    //attributes
    private String name;
    private Cart cart;

    private static final Double DISCOUNT = 0.10;

    //Constructor


    public Shop(String name) {
        this.name = name;
        this.cart = cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    // Methods
    // method to calculate total amount of products in the cart
    public Double calculateAmountForCustomer(Customer customer) {
        customer.showCustomerDetails();

        Double sumTotal = 0.0;

        for (Product list : cart.getListProduct()) {
            // it is calculate price
            sumTotal += list.calculatePrice();
        }

        if (sumTotal > 500) {
            sumTotal *= (1 - DISCOUNT);
        }

        return sumTotal;


    }

}
