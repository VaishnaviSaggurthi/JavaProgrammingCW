package Recursion;
import java.util.Scanner;
public class PrintAllNumbersNTo1 {
    static void Decreasing(int n){
        // Base Case
        if(n==1){
            System.out.println(n);
            return;
        }
        // Self Work
        System.out.println(n); // n
        // Recursive Work
         Decreasing(n-1); // n-1,n-2....1
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n :");
        int n = sc.nextInt();
        Decreasing(n);
    }
}
