package Sorting;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Entering the length of an array
        System.out.println("Enter the size of an array :");
        int n = sc.nextInt();
        int[] arr = new int[n];
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
        // Bubble Sort Algorithm
        for(int i=0;i<n-1;i++){  // outer loop --> no.of passes
            for(int j=0;j<n-1-i;j++){ // inner loop --> no.of iterations
                /*
                Last i elements are already at correct
                 sorted position so no need to check them
                 */
                if(arr[j+1]<arr[j]){
                    // swap the elements
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("The Sorted Array is :");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
