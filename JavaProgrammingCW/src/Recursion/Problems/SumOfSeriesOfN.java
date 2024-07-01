package Recursion.Problems;

import java.util.Scanner;

public class SumOfSeriesOfN {
    static int seriesOfn(int n){
        // base case
        if(n==0){
            return 0;
        }
        if(n%2!=0){
            return seriesOfn(n-1) + n; // odd
        }
        else{
            return seriesOfn(n-1) - n; // even
        }
        // 1-2+3-4+5-6+7.... odd--> (+) add , even --> (-) subtract
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number n :");
        int n = sc.nextInt();
        System.out.println("The Sum of the series up to n is :"+seriesOfn(n));
    }
}
