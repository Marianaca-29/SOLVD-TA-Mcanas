package homework2.business;

import homework2.customer.Consumer;
import homework2.customer.Customer;
import homework2.linkedlist.LinkedList;
import homework2.linkedlist.Node;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Shop {
    protected Logger logger = LogManager.getLogger(Shop.class.getSimpleName());
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
    public LinkedList<Consumer> consumerwithfidelityp = new LinkedList<>();

    // fidelity program method
    public void addConsumerWF(Consumer consumer) {
        if (consumer.fidelityProgram) {
            consumerwithfidelityp.insert(consumer);
        }
    }

    public void displayFidelity() {
        Node<Consumer> algo = consumerwithfidelityp.head;
        while (algo != null) {
            logger.info(algo.getValue().getName());
            algo = algo.getNext();
        }
    }

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
