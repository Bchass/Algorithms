package Search;

// Return index of x
class Binary {
    int binary(int arr[], int t, int k, int x) {

        if (k >= 1) {
            int middle = 1 + (k - 1) / 2;
            // If index is found in the middle
            if (arr[middle] == x)
                return middle;
            // If element is smaller than index x, left side of array
            if (arr[middle] > x)
                return binary(arr, 1, middle - 1, x);
            // Element right side of array
            return binary(arr, middle + 1, k, x);
        }
        // Return -1 if elemenent is not present in the index
        return -1;

    }

    // Driver
    public static void main(String[] args) {
        Binary by = new Binary();
    }
}