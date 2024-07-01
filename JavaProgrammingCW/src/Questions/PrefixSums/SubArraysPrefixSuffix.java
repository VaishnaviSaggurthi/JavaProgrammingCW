package Questions.PrefixSums;

import java.util.Scanner;

public class SubArraysPrefixSuffix {
    static int findArraySum(int[] arr){
        int totalSum = 0;
        for(int i=0;i<arr.length;i++){
            totalSum+=arr[i];
        }
        return totalSum;
    }
    static boolean equalPartitionSum(int [] arr){
     int totalSum = findArraySum(arr);
    int prefixSum = 0;
    for(int i=0;i<arr.length;i++){
        prefixSum+=arr[i];
        int suffixSum = totalSum - prefixSum;
        if(suffixSum==prefixSum){
            return true;
        }
    }
    return false;
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
        System.out.println("Is there possibility of partition :"+equalPartitionSum(array));
    }
}
