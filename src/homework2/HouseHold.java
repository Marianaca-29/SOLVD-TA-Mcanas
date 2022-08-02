package homework2;

public class HouseHold extends Product {

    // fields
    private Boolean safety;
    private Boolean climateFriendly;

    // constructor

    public HouseHold(String name, String description, Double weight, Double price, Boolean safety, Boolean climateFriendly) {
        super(name, description, weight, price);
        this.safety = safety;
        this.climateFriendly = climateFriendly;
    }

    // implementing methods

    @Override
    public Double calculatePrice() {

        return calculatePrice();
    }
}
