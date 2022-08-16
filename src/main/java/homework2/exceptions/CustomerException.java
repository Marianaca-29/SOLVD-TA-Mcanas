package homework2.exceptions;

public class CustomerException extends Exception {
    public CustomerException(String message) {

        super(message);
    }

    public CustomerException() {

        super();
    }

    @Override
    public String toString() {
        return "Exception caused by: " + getMessage();
    }
}