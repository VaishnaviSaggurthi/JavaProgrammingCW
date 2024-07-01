package Questions;

import java.util.Scanner;

public class RotatingByKSteps_Meth3 {
    static void reverse(int [] arr,int x,int y){
        for(int i=x,j=y;i<j;i++,j--){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array :");
        int n = sc.nextInt();
        System.out.println("Enter the value of k i.e no of rotations :");
        int k= sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements of an array :");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Original Array is :");
        for(int i=0;i< array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
        k =k%n;
        reverse(array,0,n-k-1);
        reverse(array,n-k,n-1);
        reverse(array,0,n-1);
        System.out.println("The k times rotated array is :");
        for(int i=0;i< array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
}
