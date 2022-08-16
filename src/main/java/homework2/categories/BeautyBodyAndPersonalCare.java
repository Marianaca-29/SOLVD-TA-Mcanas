package homework2.categories;

import homework2.business.Product;
import homework2.exceptions.PriceException;
import homework2.interfaces.ITaxation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class BeautyBodyAndPersonalCare extends Product implements ITaxation {

    private Logger logger = LogManager.getLogger(BeautyBodyAndPersonalCare.class);

    //private Logger logger = LogManager.getLogger(BeautyBodyAndPersonalCare.class.getSimpleName());

    //fields

    private Boolean hypoalergenic;
    private Boolean madeForWomen;

    private final static double FIX_AMOUNT = 5.0;

    //constructor

    public BeautyBodyAndPersonalCare(String name, String description, Double weight, Double price, Boolean hypoalergenic, Boolean madeForWomen) throws PriceException {
        super(name, description, weight, price);
        this.hypoalergenic = hypoalergenic;
        this.madeForWomen = madeForWomen;
    }


    //implementing method

    @Override
    public Double calculatePrice() {

        if (hypoalergenic || madeForWomen) {
            double productNat = price += FIX_AMOUNT;
            return productNat;

        } else {
            return price;
        }

    }

    @Override
    public void addTaxation(double percentage) {
        double taxationCalculated = calculatePrice() * (1 + (percentage / 100));
        if (percentage <= 10.0) {
            price = taxationCalculated;
        } else {
            logger.info("The percentage of taxation is not allowed ");

        }
    }
}


