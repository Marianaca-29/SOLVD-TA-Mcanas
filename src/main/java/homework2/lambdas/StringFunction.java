package homework2.lambdas;

public interface StringFunction {
    String run(String str);

    StringFunction asking = (s) -> s + "?";
    StringFunction answering = (s) -> s + "!";
    StringFunction saying = (s) -> s + "!";

    public static void printFormatted(String str, StringFunction format) {
        String result = format.run(str);
        System.out.println(result);
    }
}