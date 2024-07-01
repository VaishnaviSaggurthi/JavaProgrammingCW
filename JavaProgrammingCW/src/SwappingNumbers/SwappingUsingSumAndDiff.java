package SwappingNumbers;

import java.util.Scanner;

public class SwappingUsingSumAndDiff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number :");
        int num1 = sc.nextInt();
        System.out.println("Enter Second Number :");
        int num2 = sc.nextInt();
        System.out.println("The first number before swapping is :"+num1);
        System.out.println("The second number before swapping is :"+num2);
        num1 =num1 + num2;
        num2 =num1 - num2;
        num1 =num1 - num2;
        System.out.println("The first number after swapping is :"+num1);
        System.out.println("The second number after swapping is :"+num2);
    }
}
