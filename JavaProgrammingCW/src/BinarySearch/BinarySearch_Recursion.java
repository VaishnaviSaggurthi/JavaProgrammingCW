package BinarySearch;

import java.util.Scanner;

public class BinarySearch_Recursion {
    static boolean flag(int[] arr,int start,int end,int target) {
        int n=arr.length;
        if(start>end) return false;
            int mid = start + (end-start) / 2;
            if (target == arr[mid]) {
                return true;
            }
            else if (target < arr[mid])  return  flag(arr,start,mid-1,target);
            else  return flag(arr,mid+1,end,target);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements in sorted order:");
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter the target element:");
        int target=sc.nextInt();
        int start=0,end=n-1;
        System.out.println(flag(arr,start,end,target));
    }
}
