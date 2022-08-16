package homework2.exceptions;

public class PriceException extends Exception {
    public PriceException(String message) {

        super(message);
    }

    public PriceException() {
        super();
    }

    @Override
    public String toString() {
        return "Exception caused by: " + getMessage();
    }

}
