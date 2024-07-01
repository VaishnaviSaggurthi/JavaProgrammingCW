package Questions.TwoPointerQue;

import java.util.Scanner;

public class EvenAndOddStart_End {
    static void sortEvenOdd(int[] array){
        int n= array.length;
        int left=0;
        int right=n-1;
        while(left<right) {
            if (array[right] %2 == 0 && array[left]%2!=0  ) {
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;
                left++;
                right--;
            }
            if (array[left] %2 ==0) {
                left++;
            }
            if (array[right] % 2 != 0) {
                right--;
            }
        }
    }
    static void printArray(int [] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
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
        sortEvenOdd(array);
        System.out.println("Sorted Array is :");
        printArray(array);
    }
}
