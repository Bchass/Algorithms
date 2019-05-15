public class SelectionSort {
    void sort(int arr[]) {
        // move boundary within array
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            // Index of min
            int min = i;
            // Find min within the array
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min])
                    min = j;
                // swap min with first element
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = min;

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

    {

    }
}