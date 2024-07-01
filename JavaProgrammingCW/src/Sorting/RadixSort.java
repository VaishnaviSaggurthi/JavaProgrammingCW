package Sorting;

import java.util.Scanner;

public class RadixSort {
    static void displayArray(int[] array){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
    static int findMax(int[] array){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<array.length;i++){
            if(max<array[i]){
                max=array[i];
            }
        }
        return max;
    }
    static void countSort(int[] array,int place){
        int n = array.length;
        int[] count = new int[10];
        int[] output = new int[n];
        // Make a frequency array
        for(int i=0;i< array.length;i++) {
            count[(array[i]/place)%10]++;
        }
        // make a prefix sum array of count array
        for(int i=1;i< count.length;i++){
            count[i]+=count[i-1];
        }
        // find the index of each element in the original array and put it in output array
        for(int i=n-1;i>=0;i--){
            int index = count[(array[i]/place)%10]-1;
            output[index]=array[i];
            count[(array[i]/place)%10]--;
        }
        // copy all the elements of output  array to array "array"
        for(int i=0;i<n;i++){
            array[i]=output[i];
        }
    }
    static void radixSort(int[] array){
        int max = findMax(array);
        for(int place=1;max/place>0;place*=10){
            countSort(array,place);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array :");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter elements into an array :");
        for(int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("The Array Before Sorting Is :");
        displayArray(array);
        System.out.println();
        radixSort(array);
        System.out.println("The Array After Sorting Is :");
        displayArray(array);
    }
}
