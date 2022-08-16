package homework2.categories;

import homework2.business.Product;
import homework2.exceptions.PriceException;
import homework2.interfaces.ITaxation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HouseHold extends Product implements ITaxation {

    private Logger logger = LogManager.getLogger(HouseHold.class);

    // fields
    private Boolean safety;
    private Boolean climateFriendly;

    private final static double FIX_AMOUNT_SAFETY = 10.0;

    private final static double FIX_AMOUNT_CLIMATE = 5.0;


    // constructor

    public HouseHold(String name, String description, Double weight, Double price, Boolean safety, Boolean climateFriendly) throws PriceException {
        super(name, description, weight, price);
        this.safety = safety;
        this.climateFriendly = climateFriendly;
    }

    // implementing methods

    @Override
    public Double calculatePrice() {
        if (safety) {
            double addAmount = price + FIX_AMOUNT_SAFETY;
            return addAmount;
        } else if (climateFriendly) {
            double discountPrice = price - FIX_AMOUNT_CLIMATE;
            return discountPrice;
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
            logger.error("The percentage of taxation is not allowed ");

        }
    }
}
