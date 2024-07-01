package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SmallestAndLargest {
    static int[] smallestAndLargestElement(int[] arr){
        Arrays.sort(arr);
        int [] ans = {arr[0],arr[arr.length-1]};
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
        int[] ans = smallestAndLargestElement(array);
        System.out.println("Smallest Element is :"+ans[0]);
        System.out.println("Largest Element is :"+ans[1]);
    }
}
