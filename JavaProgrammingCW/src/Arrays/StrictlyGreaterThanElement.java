package Arrays;

import java.util.Scanner;

public class StrictlyGreaterThanElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array :");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements of an array :");
        for (int i = 0; i < array.length;i++){
            array[i] = sc.nextInt();
        }
        System.out.println("Enter Target Element :");
        int target = sc.nextInt();
        int count = 0;
        for(int i=0;i<array.length;i++){
            if(array[i]>target){
               count++;
            }
        }
        System.out.println("The Elements strictly greater than the target element in the array is :"+count);
    }
}
