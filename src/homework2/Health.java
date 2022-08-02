package homework2;

public class Health extends Product implements Insurance {

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

        return price();
    }

    public double addInsurance(double percentage) {
        double insuranceAdded = getPrice() * percentage;
        setPrice(getPrice() + insuranceAdded);
        return insuranceAdded;
    }
}
