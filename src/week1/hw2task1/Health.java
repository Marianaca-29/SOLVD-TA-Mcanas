package week1.hw2task1;

public class Health extends Products{

    // fields
    private Boolean safety;

    // constructor


    public Health(String name, String description, Double weight, Double price, Boolean safety) {
        super(name, description, weight, price);
        this.safety = safety;
    }

    // implementing methods
    @Override
    public Double calculatePrice() {
        return null;
    }
}
