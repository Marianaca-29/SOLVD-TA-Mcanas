package homework1;
//2) Task 2
//You have array of numbers [3, 7, 6, 13, 33, 9, -100, 25]
//Print all the values of array using while loop.
//In the same loop find the biggest and the smallest value of an array and then print values afterwards

public class Task2 {
    public static void main(String[] args) {

        int[] numbers = new int[]{3, 7, 6, 13, 33, 9, -100, 25};
        int i = 0;
        int smallest = numbers[0];
        int biggest = numbers[0];


        while (i < numbers.length) {

            System.out.println(numbers[i]);
            if (numbers[i] > biggest) {
                biggest = numbers[i];
            } else if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
            i++;
        }

        System.out.println("the smallest value is " + smallest);
        System.out.println("the biggest value is " + biggest);
    }

}

