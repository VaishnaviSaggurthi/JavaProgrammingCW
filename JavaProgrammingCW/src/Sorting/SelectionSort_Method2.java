package Sorting;

import java.util.Scanner;

public class SelectionSort_Method2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Entering the length of an array
        System.out.println("Enter the size of an array :");
        int n = sc.nextInt();
        int arr[] = new int[n];
        // Creating an array
        System.out.println("Enter the elements of an array :");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The Original Array is :");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        // Selection Sort Algorithm
        for(int i=0;i<n-1;i++) { // i represents current index
            int minIndex = i;
            for(int j=i+1;j<n;j++){ // Find the min element in the unsorted part of array
              if(arr[j]<arr[minIndex]) {
                  minIndex = j;
              }
            }
            // swapping
            int temp = arr[i];
            arr[i]=arr[minIndex];
            arr[minIndex]=temp;
        }
        System.out.println("The Sorted Array is :");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
