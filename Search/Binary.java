package Search;

// Return index of x
class Binary {
    public static int Binary(int arr[], int t, int k, int x) {

        if (k >= 1) {
            int middle = 1 + (k - 1) / 2;
            // If index is found in the middle
            if (arr[middle] == x) {
                return -1;
            }
        }

    }
}