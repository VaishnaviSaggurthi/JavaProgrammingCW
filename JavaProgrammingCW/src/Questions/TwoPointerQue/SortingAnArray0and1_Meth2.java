package Questions.TwoPointerQue;

import java.util.Scanner;
public class SortingAnArray0and1_Meth2 {
    static void printArray(int [] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
    static void sorting0and1(int[] array){
        int zeroes =0;
        // counting no. of zeroes
        for(int i=0;i< array.length;i++){
            if(array[i]==0){
                zeroes++;
            }
        }
        // 0 to zeroes-1, zeroes to n-1
        for(int i=0;i<array.length;i++){
            if(i<zeroes){
                array[i]=0;
            }
            else{
                array[i]=1;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array :");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements containing 0's and 1's of an array :");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Original Array is :");
        printArray(array);
        System.out.println();
        sorting0and1(array);
        System.out.println("Sorted Array is :");
        printArray(array);
    }
}
