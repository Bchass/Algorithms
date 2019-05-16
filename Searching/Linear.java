package Searching;

class Linear{
    public static int search(int arr [], int x)
    {   // Loop through to find the given target
        int n = arr.length;
        for(int i = 0; n < arr.length; i++)
        {
            if(arr[i] == x)
            {
                return i;
            }
        }
        return - 1;
    }
}
