package homework2.business;

// I made the parent class abstract
// Remember: Abstract class must have at least one asbtract method

import homework2.exceptions.PriceException;

public abstract class Product {


    //fields

    protected String name;
    protected String description;
    protected Double weight;
    protected Double price;

    //constructor

    public Product(String name, String description, Double weight, Double price) throws PriceException {
        this.name = name;
        this.description = description;
        this.weight = weight;
        if (price < 0) {
            throw new PriceException("The price is not accurate: ");
        } else {
            this.price = price;
        }
    }

    public Double getPrice() {

        return price;
    }

    public void setPrice(Double price) {

        this.price = price;
    }
    // methods
    // this is the abstract method: it does not make any action

    public abstract Double calculatePrice();


    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

}
