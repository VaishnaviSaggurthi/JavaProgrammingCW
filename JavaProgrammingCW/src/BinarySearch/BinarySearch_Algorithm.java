package BinarySearch;

import java.util.Scanner;

public class BinarySearch_Algorithm {
   static boolean flag(int[] arr,int target) {
       int n=arr.length;
       int start=0,end=n-1;
           while (start <= end) {
               int mid = (start + end) / 2;
                if (target == arr[mid]) {
                   return true;
               }
                else if (target < arr[mid]) end = mid - 1;
                else start = mid + 1;
           }
       return false;
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
        System.out.println(flag(arr,target));
   }
}
