package Recursion.Problems;

import java.util.Scanner;

public class ARaisedToPowerBRecursion {
    static int aRaisedTob(int a,int b){
       // base case
        if(b==0){
            return 1;
        }
        int ans = aRaisedTob(a,b/2);
        if(b%2==0){
            return ans * ans;
        }
        else{
            return ans * ans * a;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of base :");
        int a = sc.nextInt();
        System.out.println("Enter the value of power :");
        int b = sc.nextInt();
        System.out.println(a+" raised to the power "+b+" is : "+aRaisedTob(a,b));
    }
}
