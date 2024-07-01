package SortingProblems;

import java.util.Scanner;

public class Sort012InAscendingOrder {
    static void display(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void swap(int[] arr,int x,int y){
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
    static void sort012(int[] arr){
        int low=0,mid=0,high= arr.length-1;
        while(mid<=high){
            if(arr[mid]==0){
                swap(arr,mid,low);
                mid++;
                low++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else{
                swap(arr,mid,high);
                high--;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements containing 0's,1's and 2's into the array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The Original Array is:");
        display(arr);
        System.out.println();
        System.out.println("The Sorted Array is:");
        sort012(arr);
        display(arr);
    }
}
