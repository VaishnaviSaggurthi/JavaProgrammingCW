package SortingProblems;

import java.util.Scanner;

public class SortArrayHavingTwoDistortions {
   public static void displayArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void sortArray(int[] arr, int n){
      if(n<=1) return; // edge cases or corner cases
        int x=-1,y=-1;
        for(int i=1;i<n;i++){
            if(arr[i-1]>arr[i]){
                if(x==-1){ // First Conflict
                    x=i-1;
                    y=i;
                }
                else{ // Second Conflict
                    y=i;
                }
            }
        }
        // Swap  x and y
        int temp=arr[x];;
        arr[x]=arr[y];
        arr[y]=temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int n = sc.nextInt(); // size of an array
        int[] arr = new int[n]; // array of size n
        System.out.println("Enter elements in the array in increasing order with two distortions:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The Original Array is:");
        displayArray(arr);
        System.out.println();
        sortArray(arr,n);
        System.out.println("The Sorted Array is:");
        displayArray(arr);
    }
}
