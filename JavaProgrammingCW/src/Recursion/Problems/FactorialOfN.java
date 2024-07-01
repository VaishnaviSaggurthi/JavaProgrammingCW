package Recursion.Problems;

import java.util.Scanner;

public class FactorialOfN {
    static int factorial(int n){
        // Base Case
        if(n==0 || n==1){
            return 1;
        }
        return n *  factorial(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n :");
        int n = sc.nextInt();
        System.out.println("The Factorial of "+n+" is "+factorial(n));
    }
}
