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

        }
    }
}
