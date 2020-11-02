package Sort.ShellSort;
public class ShellSort{
    void sort(int arr[]){
        int n = arr.length, x, i, j, temp;

        // x = big gap
        for( x = n/2; x > 0; x /= 2){
            // i = smaller gap
            for(i = x; i < n; i+=1){
                // temp array
                temp = arr[i];
                // shift values from smaller gap to correct location
                for(j = i; j >= x && arr[j-x] > temp; j -= x)
                arr[j] = arr[j - x];
                // move the temp array to correct location
                arr[j] = temp;

            }
        }
    }
    static void printArr(int arr[]){
        int n = arr.length, i;
        for(i = 0; i < n; ++i){
            System.out.println(arr[i] + " ");
            System.out.println();
        }
    }

    public static void main(String[]args){
        int arr[] = { 23, 45, 3, 5, 11 };
        ShellSort sort = new ShellSort();
        sort.sort(arr);
        printArr(arr);
    }
}
