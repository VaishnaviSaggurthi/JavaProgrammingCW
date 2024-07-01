package Arrays;

import java.util.Scanner;

public class SortedArrayOrNot {
    static boolean isSorted(int[] arr) {
        boolean check = true; // First assuming that the array is sorted
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                check = false; // which means the array is unsorted
            }
        }
        return check;
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
            isSorted(array);
            System.out.println("Is Sorted :"+isSorted(array));
        }
    }
