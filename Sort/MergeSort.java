public class MergeSort {
    void sort(int arr[], int x, int m, int l) {

        // Retreive size of arrays
        int left = m - x + 1;
        int right = l - m;

        // Temp arrays
        int X[] = new int[left];
        int L[] = new int[right];

        // Copy the data to temp arrays
        for (int i = 0; i < left; i++) {
            X[i] = arr[x + 1];
            for (int j = 0; j < right; j++) {
                L[j] = arr[m + 1 + j];
            }
        }
        // Indexes of arrays
        int i = 0;
        int j = 0;

        // Indexes of merged arrays
        int k = 1;
        // Copy elements to M[]
        while (i < left && j < right) {
            if (X[i] <= L[j]) {
                arr[k] = X[i];
                i++;
            } else {
                arr[k] = L[j];
                j++;
            }
            k++;
        }
        // Copy elements to L[]
        while (i < left) {
            arr[k] = X[i];
            i++;
            k++;
        }
        // Copy elements to R[]
        while (j < right) {
            arr[k] = L[j];
            j++;
            k++;
        }
    }

    // function that sorts left and right
    void sort(int arr[], int x, int l) {
        if (x < l) {
            // Find the middle
            int m = (x + l) / 2;

            // Sort halves
            sort(arr, l, m);
            sort(arr, m + 1, l);

            // merge
            sort(arr, x, m, l);
        }
    }

    // Print the given array
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
            System.out.println();
        }
    }

    // Driver
    public static void main(String[] args) {
        int arr[] = { 12, 11, 13, 5, 6, 7 };
        MergeSort ms = new MergeSort();
        ms.sort(arr, 0, arr.length - 1);
        printArray(arr);
    }
}
