package Sort.QuickSort;

public class QuickSort{
    public static void QS(int arr[], int start, int end){
    if(start<end){
        int partitionIndex = partition(arr,start,end);

        QS(arr, start, partitionIndex - 1);
        QS(arr, partitionIndex + 1, end);
    }
}

private static int partition(int arr[],int start,int end){
    int pivoit = arr[end];
    int i = (start - 1);

    for(int x = start; x < end; x++){
        if(arr[x] <= pivoit){
            i++;

            int temp = arr[i];
            arr[i] = arr[x];
            arr[x] = temp;
        }
    }

    int temp = arr[i+1];
    arr[i+1] = arr[end];
    arr[end] = temp;

    return i + 1;
}
}