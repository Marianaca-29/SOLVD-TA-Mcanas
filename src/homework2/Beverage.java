package homework2;

public class Beverage extends Product {

    private Boolean refrigerated;
    private String ingredientType;

    //constructor

    public Beverage(String name, String description, Double weight, Double price, Boolean refrigerated, String ingredientType) {
        super(name, description, weight, price);
        this.refrigerated = refrigerated;
        this.ingredientType = ingredientType;
    }


    //
    @Override
    public Double calculatePrice() {

        return price();
    }


}


