package Recursion;

import java.util.Scanner;

public class FrogJumpProblem {
    static int best(int[] h,int n,int index){
        // Base Case
        if(index==n-1) return 0; // min cost incurred for only one element in the array is : 0
        //   Self Work and Recursive work
        int op1= Math.abs(h[index]-h[index+1]) + best(h,n,index+1);
        if(index==n-2) return op1;
       int op2= Math.abs(h[index]-h[index+2]) + best(h,n,index+2);
       return Math.min(op1,op2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array :"); // length of an array
        int n = sc.nextInt();
        int h[] = new int[n];
        System.out.println("Enter the height's array :"); // here stones are indices
        for(int i=0;i<n;i++){
            h[i] = sc.nextInt();
        }
        int index = 0;
        System.out.println("The minimum cost incurred for frog to jump from one stone to another is :"+best(h,n,index));
    }
}
