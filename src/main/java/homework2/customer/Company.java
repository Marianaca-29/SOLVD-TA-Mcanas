package homework2.customer;

import homework2.business.Product;
import homework2.exceptions.CustomerException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Company extends Customer {

    private Logger logger = LogManager.getLogger(Company.class.getSimpleName());

    private String taxNumberId;

    Product product;

    public Company(String name, String lastname, int idCostumer, String taxNumberId) throws CustomerException {
        super(name, lastname, idCostumer);
        this.name = name;
        this.lastname = lastname;
        this.idCostumer = idCostumer;
        if (taxNumberId.length() < 11) {
            throw new CustomerException("The Tax Number Identification is too short: ");
        } else this.taxNumberId = taxNumberId;
    }

    @Override
    public void showCustomerDetails() {

        logger.info("The Consumer is: " + name + " " + lastname + " " + ", idCostumer: " + idCostumer + taxNumberId + "");
    }

}
