package Recursion.Problems;

import java.util.Scanner;

public class PrintKMultiplesOfNum {
    static void kMultiplesOfNum(int num,int k){
        // base case
        if(k==0){
            return;
        }
        kMultiplesOfNum(num,k-1);  // k-1 Multiples
        System.out.print(num * k +" "); // Last Multiple of k
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int num = sc.nextInt();
        System.out.println("Enter the value of k :");
        int k = sc.nextInt(); // k multiples of num
        System.out.println("Multiples of "+num+" is :");
        kMultiplesOfNum(num,k);
    }
}
