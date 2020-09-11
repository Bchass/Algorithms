package Other;

public class Fibonacci {
    static int fib(int n) {
        // Return n if it's less or equal to 1
        if (n <= 1)
            return n;
        // If > 1, return the calcualtion    
        return fib(n - 1) + fib(n - 2);
    }
    // Driver
    public static void main(String[] args) {
        int n = 4;
        System.out.println(fib(n));
    }
}
