package javaInput;

import java.util.Scanner;

public class sumOf2numbersinput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1 :");
        int num1;
        num1 = sc.nextInt();
        System.out.println("Enter num2 :");
        int num2;
        num2 = sc.nextInt();
        int sum=num1+num2;
        System.out.println("The sum of two numbers is :"+sum);
    }
}
