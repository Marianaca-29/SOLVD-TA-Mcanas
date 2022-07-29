package week1.hw2task1;

public class Customer {

    // fields
    private String name;
    private String lastname;
    private int idCostumer;
    private Cart cart;

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
