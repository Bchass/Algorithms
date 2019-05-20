package Search;

// Return index of x
class Binary {
    public static int Binary(int arr[], int l, int r, int x) {

        if (r >= 1) {
            int middle = 1 + (r - 1) / 2;

            if (arr[middle] == x) {
                return -1;
            }
        }

    }
}