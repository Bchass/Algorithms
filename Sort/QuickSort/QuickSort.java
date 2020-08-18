package Sort.QuickSort;
// Take user input for QuickSort
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class QuickSort {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("How many values would you like to enter?");
            int n = sc.nextInt();

            int arr[] = new int[n];
            System.out.println("Enter the " + n + " values with spaces between");

            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            // Calls functions to apply QS
            QS(arr, 0, arr.length - 1);

            System.out.println("The values you have entered:");
            System.out.println(" = " + printArr(arr));
            System.out.println("QuickSort applied: "+ Arrays.toString(arr));

            sc.close();

            // custom try catch statement
        } catch (InputMismatchException e) {
            throw new InputMismatchException("Input must contain only values!");
        }
    }

    // Function to print user inputs values to an array
    // if true numbers will print -- > array
    public static boolean printArr(int[] arr) {

        int x = arr.length;

        for (int i = 0; i < x; i++) {
            System.out.print(arr[i] + " ");
        }
        return true;
    }

    // Call upon partition 
    public static void QS(int arr[], int start, int end) {
        if (start < end) {
            int partitionIndex = partition(arr, start, end);

            QS(arr, start, partitionIndex - 1);
            QS(arr, partitionIndex + 1, end);
        }
    }

    // partition
    private static int partition(int arr[], int start, int end) {
        int pivot = arr[end];
        int i = (start - 1);

        for (int x = start; x < end; x++) {
            if (arr[x] <= pivot) {
                i++;

                int temp = arr[i];
                arr[i] = arr[x];
                arr[x] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[end];
        arr[end] = temp;

        return i + 1;
    }
}
