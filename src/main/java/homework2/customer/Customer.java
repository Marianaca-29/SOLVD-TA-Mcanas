package homework2.customer;

import homework2.business.Product;

public abstract class Customer {


    // fields
    protected String name;
    protected String lastname;
    protected int idCostumer;

    protected Product product;

    public Customer(String name, String lastname, int idCostumer) {
        this.name = name;
        this.lastname = lastname;
        this.idCostumer = idCostumer;
    }

    public abstract void showCustomerDetails();
}
