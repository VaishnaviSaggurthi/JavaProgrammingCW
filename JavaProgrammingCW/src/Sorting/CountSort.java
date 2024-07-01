package Sorting;
import java.util.Scanner;
public class CountSort {
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
    static void countSort(int[] array){
        int max=findMax(array);
        int[] count = new int[max+1];
        for(int i=0;i< array.length;i++){
            count[array[i]]++;
        }
        int k=0;
        for(int i=0;i<count.length;i++){
            for(int j=0;j<count[i];j++){
                array[k++]=i;
            }
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
        countSort(array);
        System.out.println("The Array After Sorting Is :");
        displayArray(array);
    }
}
