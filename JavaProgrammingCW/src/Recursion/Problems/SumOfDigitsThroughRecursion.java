package Recursion.Problems;

import java.util.Scanner;

public class SumOfDigitsThroughRecursion {
    static int sumOfDigits(int n){
       // Base Case
        if(n>=0 && n<=9){
            return n;
        }
       // Recursive Work --> n/10 { sum of digits except last digit }
       // Self Work --> n % 10 { last digit }
     return sumOfDigits(n/10) + n%10;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n :");
        int n = sc.nextInt();
        System.out.println("The Sum of given digit is :"+sumOfDigits(n));
    }
}
