package homework2;

// I made the parent class abstract
// Remember: Abstract class must have at least one asbtract method

public abstract class Product {

    //fields

    private String name;
    private String description;
    private Double weight;
    private Double price;

    //constructor
    public Product(String name, String description, Double weight, Double price) {
        this.name = name;
        this.description = description;
        this.weight = weight;
        this.price = price;

    }

    //getters and setters


    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double weight() {
        return weight;
    }

    public Double price() {

        return price;
    }

    // methods
    // this is the abstract method: it does not make any action

    public abstract Double calculatePrice();

    @Override
    public String toString() {
        return "Products{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
