package Questions.PrefixSums;

import java.util.Scanner;

public class SuffixSumArray {
    static void printArray(int[] arr){
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static int[] suffixSumArray(int [] arr){
        int n = arr.length;
        int [] suffix = new int[n];
        for(int i=n-2;i>=0;i--){
             suffix[n-1]=arr[n-1];
            suffix[i]=suffix[i+1]+arr[i];
        }
        return suffix;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array :");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements of an array :");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
       int [] array_2 = suffixSumArray(array);
        System.out.println("The Suffix Sum Array is :");
        printArray(array_2);
    }
}
