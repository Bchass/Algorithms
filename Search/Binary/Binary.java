package Search.Binary;

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
        int arr[] = { 2, 9, 80, 77, 36, 1, 5, 4};
        Binary by = new Binary();
        // Find the given index
        int x = 9;
        int n = arr.length;
        // binary function
        int result = by.binary(arr, 0, n - 1, x);
        if (result == -1) {
            System.out.println("Target is not present");
        } else {
            System.out.println("Target is present at index " + result);
        }
    }
}
