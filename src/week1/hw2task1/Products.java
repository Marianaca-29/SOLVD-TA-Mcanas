package week1.hw2task1;

// I made the parent class abstract

public abstract class Products {

    //fields

    private final String name;
    private final String description;
    private final Double weight;
    private final Double price;

    //constructor
    public Products(String name, String description, Double weight, Double price) {
        this.name = name;
        this.description = description;
        this.weight = weight;
        this.price = price;

    }

    //getters and setters

    //public String getName() {return name;} is never used

    //public String getDescription() {return description;} is never used

    public Double getWeight() {
        return weight;
    }

    public Double getPrice() {
        return price;
    }

    // public void setName(String name) {this.name = name;} is never used

    //public void setDescription(String description) { this.description = description;
    // } is never used

    //public void setWeight(Double weight) {this.weight = weight;
    // } is never used

    //public void setPrice(Double price) { this.price = price;
    // } is never used

    //methods

    public abstract Double calculatePrice();

    @Override
    public String toString() {
        return "Products{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
