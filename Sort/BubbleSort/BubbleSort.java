package Sort.BubbleSort;

public class BubbleSort {
    void sort(int arr[], int n) {

        int i, j, temp;
        boolean swapped;
        for (i = 0; i < n - 1; i++) {

        }
        swapped = false;
        for (j = 0; j < n - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                // switch a[j] & a[j + 1]
                temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
                swapped = true;

            }
            // Break
            if (swapped == false)
                break;
        }

    }

    // Print given array
    static void printArray(int arr[], int size) {
        int i;
        for (i = 0; i < size; i++) {
            System.out.println(arr[i]);
            System.out.println();

        }

    }

    // Driver
    public static void main(String[] args) {
        BubbleSort bs = new BubbleSort();
        int arr[] = { 8, 4, 3, 5, 7 };
        int n = arr.length;
        bs.sort(arr, n);
        printArray(arr, n);
    }
}
