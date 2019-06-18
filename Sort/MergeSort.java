public class MergeSort {
    void sort(int arr[], int x, int m, int l) {

        // Retreive size of arrays
        int left = m - x + 1;
        int right = l - m;

        // Temp arrays
        int M[] = new int[left];
        int L[] = new int[right];

        // Copy the data to temp arrays
        for (int i = 0; i < left; i++) {
            M[i] = arr[x + 1];
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
            if (M[i] <= L[j]) {
                arr[k] = M[i];
                i++;
            } else {
                arr[k] = L[j];
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
    }

    // Print the given array
    void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
            System.out.println();
        }
    }

    // Driver
    public static void main(String[] args) {
        MergeSort ms = new MergeSort();
        int arr[] = { 3, 90, 56, 22, 8, 4, 2 };
        ms.sort(arr, 0, 0, arr.length - 1);
        ms.printArray(arr);
    }
}
