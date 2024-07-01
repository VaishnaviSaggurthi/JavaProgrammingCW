package Recursion.Problems;

import java.util.Scanner;

public class GCD_LongDivisionAlgorithm {
    static int gcd(int x,int y){
        while(x % y!=0){
            int remainder = x % y; // Ex: x =b24 , y = 15 , remainder = x % y --> 24 % 15 = 9
            x = y; // x = 15
            y = remainder; // y = 9 and loop continues till remainder = 0
        }
        return y;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x :");
        int x = sc.nextInt();
        System.out.println("Enter the value of y :");
        int y = sc.nextInt();
        System.out.println("The GCD of "+x+" and "+y+" is : "+gcd(x,y));
    }
}
