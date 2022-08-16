package homework2.exceptions;

public class TaxException extends Exception {


    public TaxException(String message) {

        super(message);
    }

    public TaxException() {
        super();
    }

    @Override
    public String toString() {

        return "Exception caused by: " + getMessage();
    }

}

