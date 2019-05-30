public class BubbleSort {
    public static void bubbleSort() {

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
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

    }

    // Driver
    public static void main(String[]args){
        int[] a = { 8, 4, 3, 5, 7 };
        int size = a.length;
    }
}
