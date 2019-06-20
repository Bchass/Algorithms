public class MergeSort {
    void sort(int arr[], int r, int m, int l) {

        // Retreive size of arrays
        int left = m - r + 1;
        int right = l - m;

        // Temp arrays
        int L[] = new int[left];
        int R[] = new int[right];

        // Copy the data to temp arrays
        for (int i = 0; i < left; i++) {
            L[i] = arr[r + 1];
            for (int j = 0; j < right; j++) {
                R[j] = arr[m + 1 + j];
            }
        }
        // Indexes of arrays
        int i = 0;
        int j = 0;

        // Indexes of merged arrays
        int k = r;
        // Copy elements to M[]
        while (i < left && j < right) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        // Copy elements to L[]
        while (i < left) {
            arr[k] = L[i];
            i++;
            k++;
        }
        // Copy elements to R[]
        while (j < right) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    // function that sorts left and right
    void sort(int arr[], int l, int r) {
        if (l < r) {
            // Find the middle
            int m = (l + r) / 2;

            // Sort halves
            sort(arr, l, m);
            sort(arr, m + 1, r);

            // merge
            sort(arr, l, m, r);
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
