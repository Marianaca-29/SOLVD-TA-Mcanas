package homework1;

//1) Task 1
//Create simple java class with main method that prints some text.
//Parse array from main method arguments and print its first element.
//Compile and run your class from command line

public class Task1 {
    public static void main(String[] args) {
        for (String arg : args) {

            System.out.println("Showing first element:  " + arg);
        }
    }
}