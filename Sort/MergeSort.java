public class MergeSort {
    void sort(int arr[], int x, int m, int l) {

        // Retreive size of arrays
        int n1 = m - x + 1;
        int n2 = l - m;

        // Temp arrays
        int M[] = new int[n1];
        int L[] = new int[n2];

        // Copy the data to temp arrays
        for (int i = 0; i < n1; i++) {
            M[i] = arr[x + 1];
            for (int j = 0; j < n2; j++) {
                L[j] = arr[m + 1 + j];
            }
        }
        // Indexes of arrays
        int i = 0;
        int j = 0;

        // Indexes of merged arrays
        int k = 1;
        // Copy elements to M[]
        while (i < n1 && j < n2) {
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
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
    }
}
