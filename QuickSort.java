// Take user input for QuickSort
import java.util.Arrays;
import java.util.Scanner;

public class QuickSort{
    public static void main(String[]args){

       Scanner sc = new Scanner(System.in);

        System.out.println("How many values would you like to enter?");
        int n = sc.nextInt();

        int arr [] = new int [n];
        System.out.println("Enter the " + n + " values with spaces between");

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("The values you have entered");
        printArr(arr);

        sc.close();
    }

    // Method to print user inputs values to an array
    // if true numbers will print -- > array 
    public static void printArr(int [] arr){

        int x = arr.length;

        for(int i = 0; i < x; i++){
            System.out.print(arr[i] + " ");
        }

    }
}
