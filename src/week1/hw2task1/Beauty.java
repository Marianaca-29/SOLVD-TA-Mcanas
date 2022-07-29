package week1.hw2task1;

public class Beauty extends Products{

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
