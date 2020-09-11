package Other;

public class FactorialN{
    static int factorial(int n)
    {   
        // If n equals 0, return 1
        if (n == 0)
        return 1;
        // N < 0, perform calculation
        return n*factorial(n-1);
    }
    // Driver
    public static void main(String[]args)
    {   
        // Number to be computed
        int n = 10;
        // Print result
        System.out.println(factorial(n));
    }
}