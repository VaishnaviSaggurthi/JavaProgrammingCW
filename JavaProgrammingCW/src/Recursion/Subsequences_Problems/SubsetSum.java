package Recursion.Subsequences_Problems;

import java.util.Scanner;

public class SubsetSum {
    static void subsetSumArray(int[] arr,int n,int index ,int currSum){
        // Base Case
        if(index>=n) {
            System.out.println(currSum);
            return;
        }
        // Recursive Work
        subsetSumArray(arr,n,index+1,currSum+arr[index]); // currSum + currIndex
        subsetSumArray(arr,n,index+1,currSum); // currSum
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array :");
        int n = sc.nextInt(); // length of the array
        int[] arr = new int[n];
        System.out.println("Enter the elements of an array :");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int index = 0;
        int currSum = 0;
        System.out.println("The sum of every subset is :");
        subsetSumArray(arr,n,index,currSum);
    }
}
