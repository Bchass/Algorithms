public class BubbleSort {
    void sort(int arr[]) {

        int i, j, temp;
        boolean swapped;
        for (i = 0; i < a.length; i++) {

        }
        swapped = false;
        for (j = 0; j < n - 1; j++) {
            if (a[j] > a[j + 1]) {
                // switch a[j] & a[j + 1]
                temp = a[j];
                a[j] = a[j + 1];
                a[j + 1] = temp;
                swapped = true;

            }
        }
        // If nothing was switched then break
        if(swapped == false)
        break;

    }

    // Print given array
    static void printArray(int arr[], int size) {
        int n = a.length;
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
            System.out.println();

        }

    }

    // Driver
    public static void main(String[] args) {
        BubbleSort bs = new BubbleSort();
        int[] a = { 8, 4, 3, 5, 7 };
        bs.sort(a);
        bs.printArray(a, n);
    }
}
