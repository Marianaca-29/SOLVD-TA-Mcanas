package homework2.customer;

import homework2.exceptions.CustomerException;
import homework2.exceptions.DateException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Consumer extends Customer {

    private Logger logger = LogManager.getLogger(Consumer.class.getSimpleName());
    private Boolean fidelityProgram;

    private int dayBirth;
    private int monthBirth;

    private int yearBirth;

    public Consumer(String name, String lastname, int idCostumer, Boolean fidelityProgram, int dayBirth, int monthBirth, int yearBirth) throws DateException, CustomerException {
        super(name, lastname, idCostumer);
        this.fidelityProgram = fidelityProgram;
        if (dayBirth < 1 || dayBirth > 31) {
            throw new DateException("The day provided is not accurate");
        } else this.dayBirth = dayBirth;

        if (monthBirth < 1 || monthBirth > 12) {
            throw new DateException("The month provided is not accurate");
        } else this.monthBirth = monthBirth;

        if (name.length() >= 3) {
            this.name = name;
        } else throw new CustomerException("The name is too short: ");
        if (lastname.length() >= 3) {
            this.lastname = lastname;
        } else throw new CustomerException("The name or lastname is too short: ");
        this.idCostumer = idCostumer;
    }

    @Override
    public void showCustomerDetails() {
        logger.info("The Consumer is: " + name + " " + lastname + " " + "idCostumer: " + idCostumer + ", is part of Fidelity Program: " + fidelityProgram);
        //+ ", bday : " + dayBirth + " " + monthBirth + " " + yearBirth
    }

}
