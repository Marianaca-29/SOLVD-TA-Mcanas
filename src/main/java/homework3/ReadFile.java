package homework3;

import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.*;

public class ReadFile {

    public static void main(String args[]) throws FileNotFoundException {

        File f = new File("src/main/java/homework3/terms.txt");
        ArrayList arr = new ArrayList();
        HashMap<String, Integer> listOfWords = new HashMap<String, Integer>();
        Scanner in = new Scanner(f);
        int i = 0;
        while (in.hasNext()) {
            String s = in.next();
            //System.out.println(s);
            arr.add(s);
        }
        Iterator itr = arr.iterator();
        while (itr.hasNext()) {
            i++;

            listOfWords.put((String) itr.next(), i);
            //System.out.println(listOfWords);
        }

        Set<Object> uniqueValues = new HashSet<Object>(listOfWords.values());

        System.out.println("The number of unique words: " + uniqueValues.size());

        //Instantiating the File class
        File file = new File("src/main/java/homework3/rewrite.txt");
        //Instantiating the PrintStream class
        PrintStream standard = System.out;
        PrintStream stream = new PrintStream(file);
        System.out.println("Check out this file " + file.getAbsolutePath() + " <--- click in here...");
        System.setOut(stream);

        //Printing values to file
        System.out.println("Unique Words are: ");
        System.out.println(uniqueValues.size());

        //if I want to print the words explicitly that are unique
        System.out.println(listOfWords);
        //call to finish printing in file - go back to standard
        System.setOut(standard);


        // Using 5 from StringUtils.
        String s = listOfWords.toString();
        System.out.printf("The output of StringUtils.reverse() for the string - '%s' is '%s'", s, StringUtils.reverse(s));
        System.out.println();

        System.out.println(StringUtils.lowerCase(s));

        System.out.printf("The output of StringUtils.capitalize() for the string - '%s' is '%s'", s, StringUtils.capitalize(s));
        System.out.println();

        System.out.println(StringUtils.upperCase(s));

        // Using 5 from FileUtils.

    }

}
