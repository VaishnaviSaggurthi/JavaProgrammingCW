package Recursion.Problems;

import java.util.Scanner;

public class CountTheDigits {
    static int countDigits(int n){
        // Base Case
        if(n>=0 && n<=9){
            return 1;
        }
        return countDigits(n/10)+1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n :");
        int n = sc.nextInt();
        System.out.println("The Count of given digit is :"+countDigits(n));
    }
}
