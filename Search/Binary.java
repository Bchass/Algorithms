package Search;

// Return index of x
class Binary {
    int Binary(int arr[], int t, int k, int x) {

        if (k >= 1) {
            int middle = 1 + (k - 1) / 2;
            // If index is found in the middle
            if (arr[middle] == x) 
                return middle;
            // If element is smaller than index x, left side of array
            if(arr[middle] > x){
                return Binary(arr,1,middle,-1,x);
                // Element right side of array
                return Binary(arr,middle+1,k,x);
            }
            return - 1;
        }

    }
}