package homework2.lambdas;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public interface StringFunction {

    Logger logger = LogManager.getLogger(StringFunction.class);

    String run(String str);

    StringFunction asking = (s) -> s + " I'll pay with credit card";
    StringFunction answering = (s) -> s + "I have VISA";
    StringFunction saying = (s) -> s + "Goodbye";

    public static void printFormatted(String str, StringFunction format) {
        String result = format.run(str);
        logger.info(result);
    }
}