package homework1;

public class Task3V2 {
    public static void insertionSort(int[] array) {
        // up to here we have integer to return as an array

        for (int j = 1; j < array.length; ++j) {
            int key = array[j];
            // up to here we have the first for (outer loop)
            int i;
            for (i = j - 1; i > -1 && array[i] > key; --i) {
                array[i + 1] = array[i];
                // up to here we have the inner loop
            }

            array[i + 1] = key;
        }

    }

    public static void main(String[] a) {
        int[] arr1 = new int[]{3, 7, 6, 13, 33, 9, -100, 25};
        insertionSort(arr1);
        System.out.println("Printing Insertion Sort");
        int[] var2 = arr1;
        int var3 = arr1.length;

        for (int var4 = 0; var4 < var3; ++var4) {
            int i = var2[var4];
            System.out.println("" + i + " ");

        }

    }
}
