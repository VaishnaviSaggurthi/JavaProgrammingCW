package Recursion.Problems;

import java.util.Scanner;

public class IsSortedOrNot_Recursion {
    static boolean sortingArray(int[] arr ,int index){
        int n=arr.length;
        if(index==n-1){
            return true;
        }
        if(arr[index]<arr[index+1]){
            return sortingArray(arr,index+1);
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of an array :");
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        int index=0; // index
        System.out.println("Is Sorted :" +sortingArray(arr,index));
    }
}
