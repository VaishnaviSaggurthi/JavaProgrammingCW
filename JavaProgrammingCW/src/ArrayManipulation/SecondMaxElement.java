package ArrayManipulation;

import java.util.Arrays;
import java.util.Scanner;

public class SecondMaxElement {
    static int[] secondLargestElement(int[] arr){
        Arrays.sort(arr);
        int [] ans = {arr[arr.length-2]};
        return ans;
    }
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array :");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements of an array :");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        int[] ans = secondLargestElement(array);
        System.out.println("Second Largest Element is :"+ans[0]);
    }
}
