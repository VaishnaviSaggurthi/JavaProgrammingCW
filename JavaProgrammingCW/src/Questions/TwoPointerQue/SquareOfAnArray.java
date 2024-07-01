package Questions.TwoPointerQue;

import java.util.Scanner;
import java.util.Arrays;
public class SquareOfAnArray {
   /* static void reverseArray(int [] array){
       for(int i=0;i< array.length;i++) {
           for(int j=i+1;j< array.length;j++) {
               int temp = array[i];
               array[i] = array[j];
               array[j] = temp;
           }
       }
    } */
    static int[] squareArray(int [] array){
        int n= array.length;
        int [] ans = new int [n];
        int left = 0;
        int right = n-1;
        int k=n-1;
        while(left<=right){
            if(Math.abs(array[left])> Math.abs(array[right])){
                ans[k--]=array[left]*array[left];
                left++;
            }
            else{
                ans[k--]=array[right]*array[right];
                right--;
            }
        }
        return ans;
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
     int [] square_array = squareArray(array);
        System.out.println("Squared Array is :");
       // reverseArray(square_array);
        printArray(square_array);
    }
}
