package homework2.categories;

import homework2.business.Product;
import homework2.exceptions.PriceException;
import homework2.interfaces.IInsurance;
import homework2.interfaces.ITaxation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Pet extends Product implements IInsurance, ITaxation {

    private Logger logger = LogManager.getLogger(Pet.class);

    //fields
    private Boolean needsWater;

    private final static double FIX_AMOUNT_WATER = 10.0;

    //constructor

    public Pet(String name, String description, Double weight, Double price, Boolean needsWater) throws PriceException {
        super(name, description, weight, price);
        this.needsWater = needsWater;
    }


    // implementing method


    @Override
    public Double calculatePrice() {

        if (needsWater) {
            double productWater = price += FIX_AMOUNT_WATER;
            return productWater;

        } else {
            return price;
        }

    }

    @Override
    public void addInsurance(double percentage, double fixAmount) {
        double insuranceAdded = price + fixAmount + price * percentage / 100;
        price = insuranceAdded;
    }

    @Override
    public void addTaxation(double percentage) {
        double taxationCalculated = calculatePrice() * (1 + (percentage / 100));
        if (percentage <= 10) {
            price = taxationCalculated;
        } else {
            logger.error("The percentage of taxation is not allowed ");

        }
    }
}

