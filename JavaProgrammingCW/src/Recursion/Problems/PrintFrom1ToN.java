package Recursion.Problems;

import java.util.Scanner;

public class PrintFrom1ToN {
    static void Increasing(int n){
        // Base Case
        if(n==1){
            System.out.println(n);
            return;
        }
        // Recursive Work
        Increasing(n-1); // 1,2,...n-1
        // Self Work
        System.out.println(n); // n
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n :");
        int n = sc.nextInt();
        Increasing(n);
    }
}
