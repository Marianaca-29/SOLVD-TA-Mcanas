package homework2;

public class Beauty extends Product {

    //fields

    private Boolean hypoalergenic;

    //constructor

    public Beauty(String name, String description, Double weight, Double price, Boolean hypoalergenic) {
        super(name, description, weight, price);
        this.hypoalergenic = hypoalergenic;
    }


    //implementing method


    @Override
    public Double calculatePrice() {

        return null;
    }
}
