package Sorting;

import java.util.Scanner;

public class SelectionSort {
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
        for(int i=0;i<n-1;i++){ // outer loop --> no. of passes
            int min = Integer.MAX_VALUE;
            int minIndex = -1;
            for(int j=i;j<n;j++){ // inner loop --> traversing through all the elements in the array
                if(min>arr[j]){
                    min = arr[j];
                    minIndex = j;
                }
            }
            // swap min and first element of unsorted array
            int temp = arr[minIndex];
            arr[minIndex]=arr[i];
            arr[i]=temp;
        }
        System.out.println("The Sorted Array is :");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
