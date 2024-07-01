package LeetCodeQuestions;

import java.util.Scanner;

public class ClimbingStairs {
    static int climbingStairs(int n){
        // Base Case
        if(n==1 || n==2 || n==0) return n;
        int[] arr = new int[n];
        arr[0]=1;
        arr[1]=2;
        // Recursive Work
        for(int i=2;i<n;i++){
            arr[i]=arr[i-1]+arr[i-2];
        }
        // Self Work
        return arr[n-1];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n :");
        int n = sc.nextInt();
        System.out.println("The no. of ways is :"+climbingStairs(n));
    }
}
