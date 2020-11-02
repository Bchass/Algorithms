package Sort.RadixSort;

import java.util.Arrays;

public class RadixSort {
   public static void count(int arr[], int n, int ocurr){
        int output[] = new int[n], i;
        int count[] = new int[10];
        Arrays.fill(count,0);

        // store ocurrences in count
        for(i = 0; i < n; i++)
        count[(arr[i]/ocurr)%10]++;

        // count conatins the poistion of the number
        for (i = 1; i < 10; i++)
        count[i] += count[i - 1];

        // output array
        for(i = n - 1; i >= 0; i--)
        {
            output[count[(arr[i]/ocurr)%10] - 1] = arr[i];
            count[(arr[i]/ocurr)%10]--;
        }
        // output gets put into arr[i]
        for (i = 0; i < n; i++)
        arr[i] = output[i];
    }
    static void RS(int arr[], int n)
    {
        // find the maximum number
        int max = arr[0];
        for(int i = 1; i < n; i++)
        if(arr[i] > max)
        max = arr[i];

        // Sort for every number 
        for(int ocurr = 1; max/ocurr > 0; ocurr *= 10)
        count(arr, n, ocurr);
    }
    // Driver
    public static void main(String[]args)
    {
        int arr[] = { 67, 90, 22, 85, 23, 55, 24, 1 };
        int n = arr.length;
        RS(arr,n);
        for(int i = 0; i < n; i++)
        System.out.println(arr[i] + " ");
    }

}
