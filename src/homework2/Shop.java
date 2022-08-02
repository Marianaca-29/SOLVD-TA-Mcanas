package homework2;

public class Shop {

    //attributes
    private String name;
    private Cart cart;

    private static final Double DISCOUNT = 0.10;

    //Constructor


    public Shop(String name) {
        this.name = name;
        //this.cart = cart;
    }
    // setter


    public void setCart(Cart cart) {
        this.cart = cart;
    }

    // Methods
    // method to calculate total amount of products in the cart
    public Double totalAmount() {
        Double sumTotal = 0.0;

        for (Product list : cart.getListProduct()) {

            sumTotal += list.calculatePrice();

        }

        if (sumTotal > 500) {
            sumTotal *= (1 - DISCOUNT);

        }

        return sumTotal;


    }

}
