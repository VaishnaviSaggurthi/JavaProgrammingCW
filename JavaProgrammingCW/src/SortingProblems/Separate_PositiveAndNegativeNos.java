package SortingProblems;
import java.util.Scanner;
public class Separate_PositiveAndNegativeNos {
    static void partition(int[] arr){
        int l=0,r= arr.length-1;
        while(l<r){
            while(arr[l]<0) l++;
            while(arr[r]>=0) r--;
            if(l<r){
                int temp=arr[l];
                arr[l]=arr[r];
                arr[r]=temp;
                l++;
                r--;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements in the array containing both +ve and -ve no.s:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The Original Array is:");
        SortArrayHavingTwoDistortions.displayArray(arr);
        System.out.println();
        System.out.println("The Partitioned Array is:");
        partition(arr);
        SortArrayHavingTwoDistortions.displayArray(arr);

    }
}
