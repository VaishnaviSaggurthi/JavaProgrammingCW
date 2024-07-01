package Recursion.Problems;

import java.util.Scanner;

public class GCD_BruteForceAlgorithm {
    static int gcd(int x,int y){
        int max = 0;
        int min = Math.min(x,y);
        for(int i=min;i>=1;i--){
            if(x%i==0 && y%i==0 && max<i){
                max = i;
            }
        }
        return max;
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
