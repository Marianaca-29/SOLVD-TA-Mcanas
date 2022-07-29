package week1.hw1task3;
//3) Task 3
//You have array of numbers [3, 7, 6, 13, 33, 9, -100, 25]
//Sort this array using one of sorting algorithms: Insertion sort, Selection sort, Bubble sort.
//You need to understand idea of each this method but use only one for implementation
//Mariana Canas: Insertion sort

public class InsertionSort {

    void sortArray(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int current = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = current;
        }
    }

    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++)
            System.out.println(arr[i] + " ");

        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = {3, 7, 6, 13, 33, 9, -100, 25};

        InsertionSort arrayOfNumbers = new InsertionSort();
        arrayOfNumbers.sortArray(arr);

        printArray(arr);


    }
}

// will work from left to right
// Examines each item and compares it to items on its left
// Inserts the item in the correct position in the array
// It is only useful for small data sets

// Functions with an outer loop I, the number of elements in the list i=8
// and uses a variable, named key for our K, value (i=K)
// inner loop, called j, that compares the element less then i.


