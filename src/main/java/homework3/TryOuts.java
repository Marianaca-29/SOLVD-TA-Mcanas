package homework3;

import org.apache.commons.lang3.StringUtils;

public class TryOuts {
    public static void main(String[] args) {
        String text = "educative";
        char charToBeCounted = 'e';
        System.out.println(StringUtils.countMatches(text, charToBeCounted));
        String val = StringUtils.abbreviate("Delft", 4);
        val = StringUtils.capitalize("delft");
        System.out.println(val);
    }

}
