package Sort.SelectionSort;
public class SelectionSort {
    void sort(int arr[]) {
        // move boundary within array
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            // Index of min
            int min = i;
            // Find min within the array
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min])
                    min = j;
                // swap min with first element
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;

            }
        }
    }

    // Print the given arrray
    void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
            System.out.println();
        }
    }

    // Driver
    public static void main(String[] args) {
        SelectionSort ss = new SelectionSort();
        int arr[] = { 3, 78, 90, 22, 33, 41, 2 };
        ss.sort(arr);
        ss.printArray(arr);
    }
}