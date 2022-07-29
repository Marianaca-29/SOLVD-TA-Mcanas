package week1.hw2task1;

public class Customer {

    // fields
    private final String name;
    private final String lastname;
    private final int idCostumer;
    private final Cart cart;

    //Constructor

    public Customer(String name, String lastname, int idCostumer, Cart cart) {
        this.name = name;
        this.lastname = lastname;
        this.idCostumer = idCostumer;
        this.cart = cart;
    }

    public void showCustomerCart() {
        System.out.println("client name: " + name + " " + lastname + " " + "Customer ID: " + idCostumer);
        cart.showCart();
        System.out.println(cart.totalAmount());
    }

}
