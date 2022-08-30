package homework3v2;

import homework2.Main;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;

public class CountingWords {

    private static Logger logger = LogManager.getLogger(Main.class.getName());
    private static final File file = new File("src/main/resources/maven.txt");

    public static void main(String[] args) throws IOException {
        String text = FileUtils.readFileToString(file, "UTF-8").toLowerCase();

        HashSet<String> set = new HashSet<>(Arrays.asList(text.split("")));

        logger.info(text.split("").length + " words " + set.size() + " unique words");
        int uniqueWordsCounter = 0;

        String[] words = text.split("[$&+,:;=?@#|'<>,^*()%!]| |[0-9]|\n", 0);

        for (String word : words) {
            if (!StringUtils.isBlank(word) && StringUtils.countMatches(text, word) == 1) {
                uniqueWordsCounter++;
            }
        }

        FileUtils.touch(new File("src/main/resources/outcome.txt"));
        File newfile = new File("src/main/resources/outcome.txt");
        FileUtils.writeStringToFile(newfile, "Amount of unique words in this file: " + uniqueWordsCounter + "\n", "UTF-8");
        logger.info("Unique words of this document are: " + uniqueWordsCounter);
        // still trying to make it work, it does not work correctly

    }
}
