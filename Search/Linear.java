package Search;

class Linear {
    public static int search(int arr[], int x) { // Loop through to find the given target
        int n = arr.length;
        for (int i = 0; n < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    // Driver
    public static void main(String[] args) {
        int arr[] = { 3, 46, 78, 90, 23, 5, 67, 4 };
        // The given target to find
        int x = 4;

        int result = search(arr, x);
        if (result == -1)
            ;
        System.out.println("Target is not present");
        System.out.println("Target is present at index " + result);
    }
}
