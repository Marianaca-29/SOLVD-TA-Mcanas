package homework2.categories;

import homework2.business.Product;
import homework2.exceptions.PriceException;
import homework2.interfaces.ITaxation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Beverage extends Product implements ITaxation {

    private Logger logger = LogManager.getLogger(Beverage.class.getSimpleName());
    public Boolean refrigerated;
    private Boolean natural;
    private final static double FIX_AMOUNT = 5.0;

    //constructor
    public Beverage(String name, String description, Double weight, Double price, Boolean refrigerated, Boolean natural) throws PriceException {
        super(name, description, weight, price);
        this.refrigerated = refrigerated;
        this.natural = natural;
    }

    //
    @Override
    public Double calculatePrice() {

        if (refrigerated || natural) {
            double productNat = price + FIX_AMOUNT;
            return productNat;
        } else {
            return price;
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
