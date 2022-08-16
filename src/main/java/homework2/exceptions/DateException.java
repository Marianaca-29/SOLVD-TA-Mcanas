package homework2.exceptions;

public class DateException extends Exception {
    public DateException(String message) {

        super(message);
    }

    public DateException() {
        super();
    }

    @Override
    public String toString() {
        return "Exception caused by: " + getMessage();
    }


}