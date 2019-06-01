public class BubbleSort {
    void sort(int arr[]) {

        boolean sorted = false;
        // break if inner loop was swapped
        while (!sorted) {
            for (int i = 0; i < size - 1; i++) {
                sorted = true;
            }
            int j = i + 1;
            if (a[i] > a[j]) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                sorted = false;
            }
        }

    }

    {
    }

    // Print given array
    void printArray(int arr[]) {
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
        bs.printArray(a);
    }
}
