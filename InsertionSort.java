public class InsertionSort {
    void sort(int arr[]) {
        for (int j = 1; j < arr.length; j++) {
            // Find the correct key
            int key = arr[j];
            int i = j - 1;

            while (i >= 0 && arr[i] > key) {
                arr[i + 1] = arr[i];

                i--;
            }
            // Place key in the correct postion
            arr[i + 1] = key;

        }
    }

    // Print the given array
    void printArray(int arr[]) {
        int n = arr.length;
        for (int j = 1; j < n; j++) {
            System.out.println(arr[j] + " ");
            System.out.println();
        }
    }

    // Driver
    public static void main(String[] args) {
        int arr[] = { 23, 45, 3, 5, 11 };
        InsertionSort sort = new InsertionSort();
        sort.sort(arr);
        sort.printArray(arr);
    }
}
