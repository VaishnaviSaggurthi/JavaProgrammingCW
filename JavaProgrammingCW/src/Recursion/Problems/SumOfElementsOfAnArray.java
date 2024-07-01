package Recursion.Problems;

import java.util.Scanner;

public class SumOfElementsOfAnArray {
    static int sumOfElementsInArray(int[] arr,int index){
        int n = arr.length;
        if(index==n-1){
            return arr[index];
        }
        return  arr[index]+sumOfElementsInArray(arr,index+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array :");
        int n = sc.nextInt(); // size of an array
        int[] arr = new int[n];
        System.out.println("Enter the elements of an array :");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int index = 0;
        System.out.println("The maximum value in an array is :"+sumOfElementsInArray(arr,index));
    }
}
