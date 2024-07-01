package Recursion.Problems;

import java.util.Scanner;

public class PrintTheElementsOfArrThroughRecursion {
    static void arrayPrinting(int[] arr,int index){
        // Base Case
        if(index == arr.length){
            return;
        }
        // Self Work
        System.out.print(arr[index]+" ");
        // Recursive Work
        arrayPrinting(arr,index+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array :");
        int n = sc.nextInt(); // size of array
        int[] array = new int[n];
        System.out.println("Enter the elements of an array :");
        int idx = 0;
        for(int i=0;i<n;i++){
            array[i] = sc.nextInt();
        }
        System.out.println("The Array Printed through recursion is :");
        arrayPrinting(array,idx);
    }
}
