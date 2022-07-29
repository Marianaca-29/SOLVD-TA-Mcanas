package week1.hw2task1;

public class Groceries extends Products {

    private Boolean refrigerated;
    private String ingredientType;

//constructor


    public Groceries(String name, String description, Double weight, Double price, Boolean refrigerated, String ingredientType) {
        super(name, description, weight, price);
        this.refrigerated = refrigerated;
        this.ingredientType = ingredientType;
    }

    @Override
    public Double calculatePrice() {
        return getPrice() * getWeight();
    }

}
