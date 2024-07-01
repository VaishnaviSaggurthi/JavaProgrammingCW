package Questions.PrefixSums;

import java.util.Scanner;

public class SumOfPrefixes {
    static void printArray(int [] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
    static int[] prefixSum(int[] arr){
        int n = arr.length;
        int [] ans = new int [n];
        for(int i=0 ;i< arr.length;i++) {
            for(int j=0;j<i;j++) {
                ans[0] = arr[0];
                ans[i] = ans[i - 1] + arr[i];
            }
        }
        return ans;
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
        int [] pref = prefixSum(array);
        System.out.println("Prefix Sum Array is :");
        printArray(pref);
    }
}

