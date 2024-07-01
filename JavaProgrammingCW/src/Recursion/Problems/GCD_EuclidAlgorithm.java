package Recursion.Problems;

import java.util.Scanner;

public class GCD_EuclidAlgorithm {
    static int gcd(int x,int y){
        if(y==0){
            return x;
        }
        return gcd(y,x % y);
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
