package homework2.categories;

import homework2.business.Product;
import homework2.exceptions.PriceException;
import homework2.interfaces.ITaxation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Grocery extends Product implements ITaxation {

    private Logger logger = LogManager.getLogger(Grocery.class.getSimpleName());

    private Boolean refrigerated;
    private Boolean vegan;

    private final static double FIX_AMOUNT_VEGAN = 2.0;

    private final static double ADD_BAG = 2.0;

    //constructor


    public Grocery(String name, String description, Double weight, Double price, Boolean refrigerated, Boolean vegan) throws PriceException {
        super(name, description, weight, price);
        this.refrigerated = refrigerated;
        this.vegan = vegan;
    }

    @Override
    public Double calculatePrice() {

        if (vegan) {
            double productNat = price += FIX_AMOUNT_VEGAN;
            return productNat;
        } else {
            return price * weight;
        }
    }

    @Override
    public void addTaxation(double percentage) {
        double taxationCalculated = calculatePrice() * (1 + (percentage / 100));
        if (percentage <= 10) {
            price = taxationCalculated;
        } else {
            logger.info("The percentage of taxation is not allowed ");

        }
    }

}


