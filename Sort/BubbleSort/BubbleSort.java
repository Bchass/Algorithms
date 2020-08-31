package Sort.BubbleSort;

public class BubbleSort {
    void sort(int arr[], int n) {

        int temp;
        boolean sorted = false;

        while (!sorted) {
            sorted = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                	// switch arr[i] & a[i+1]
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    sorted = false;
                }

            }
        }
    }
    // Print given array
    static void printArr(int arr[], int size) {
        int i;
        for (i = 0; i < size; i++) {
            System.out.println(arr[i]);
            System.out.println();
        }
    }
    // Driver
    public static void main(String[] args) {
        BubbleSort BS = new BubbleSort();
        int arr[] = { 9,2,5,3,10,7,4,6,1,8 };
        int n = arr.length;
        BS.sort(arr, n);
        printArr(arr, n);
    }
}