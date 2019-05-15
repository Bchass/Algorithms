package Sorting;
public class InsertionSort {
    void sort(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            // Find the correct key
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            // Place key in the correct postion
            arr[j + 1] = key;

        }
    }

    // Print the given array
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i) {
            System.out.println(arr[i] + " ");
            System.out.println();
        }
    }

    // Driver
    public static void main(String[] args) {
        int arr[] = { 23, 45, 3, 5, 11 };
        InsertionSort sort = new InsertionSort();
        sort.sort(arr);
        printArray(arr);
    }
}
