package homework2.categories;

import homework2.business.Product;
import homework2.exceptions.PriceException;
import homework2.interfaces.IInsurance;
import homework2.interfaces.ITaxation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Health extends Product implements IInsurance, ITaxation {

    private Logger logger = LogManager.getLogger(Health.class);

    // fields
    private Boolean safety;

    private final static double FIX_AMOUNT_SAFETY = 20.0;


    // constructor


    public Health(String name, String description, Double weight, Double price, Boolean safety) throws PriceException {
        super(name, description, weight, price);
        this.safety = safety;
    }

    // implementing methods
    @Override
    public Double calculatePrice() {
        if (safety) {
            double productSafety = price += FIX_AMOUNT_SAFETY;
            return productSafety;
        } else {
            return price;
        }
    }
    // it does not calculates total amount

    @Override
    public void addInsurance(double percentage, double fixAmount) {
        double insuranceAdded = price + fixAmount + price * (percentage / 100);
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
