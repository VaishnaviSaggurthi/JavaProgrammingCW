package Sorting;

import java.util.Scanner;

public class QuickSort {
    static void swap(int[] arr,int x,int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
    static int partition(int[] arr,int lb,int ub){
        int pivot = arr[lb];
        int count=0;
        int start=lb , end=ub;
        for(int i=lb+1;i<=ub;i++){
            count++;
        }
        while(start<end){
            while(arr[start]<=pivot && start<ub){
                start++;
            }
            while(arr[end]>pivot && end>lb){
                end--;
            }
            if(start<end){
                swap(arr,start,end);
            }
        }
     swap(arr,lb,end);
        return end;
    }
    static void quicksort(int[] arr,int lb,int ub){
        int loc = partition(arr,lb,ub);
        if(lb>=ub) return;
            quicksort(arr, lb, loc - 1);
            quicksort(arr, loc + 1, ub);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of an array :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of an array :");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The Original Array is :");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int lb = 0;
        int ub = n-1;
        quicksort(arr,lb,ub);
        System.out.println("The Sorted Array is :");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
