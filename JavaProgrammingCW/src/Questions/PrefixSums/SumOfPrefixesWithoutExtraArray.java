package Questions.PrefixSums;

import java.util.Scanner;

public class SumOfPrefixesWithoutExtraArray {
    static void printArray(int [] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
    static int[] prefixSumArray(int[] array){
        int n= array.length;
        for(int i=1;i< array.length;i++) {
            array[0] = array[0];
            array[i] = array[i - 1]+array[i];
        }
        return array;
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
        System.out.println("Original Array is :");
        printArray(array);
        System.out.println();
        prefixSumArray(array);
        System.out.println("Prefix Sum Array is :");
        printArray(array);
    }
}
