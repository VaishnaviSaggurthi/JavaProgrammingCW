package Recursion.Problems;

import java.util.Scanner;

public class TargetElementIndex {
    static int targetElement(int[] arr,int x,int index){
        int n = arr.length;
        // Base Case
        if(index>=n) {
            return -1;
        }
        // Self Work
        if(arr[index]==x){
          return index;
        }
        // Recursive Work
        return targetElement(arr,x,index+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of an array : ");
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter the target element :");
        int x= sc.nextInt();
        int index=0;
        System.out.println("The Index of target element in the array is :"+targetElement(arr,x,index));
    }
}
