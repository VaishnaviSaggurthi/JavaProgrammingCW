package Questions;

import java.util.Scanner;

public class RotatingByKSteps_Meth2 {
   static void printFromArray(int [] arr){
       for (int i = 0; i < arr.length; i++) {
           System.out.print(arr[i]+" ");
       }
   }
    static int[] rotate(int[] arr,int k) {
        int n= arr.length;
        k = k%n;
        int[] ans = new int[n];
        int j=0;
        for(int i=n-k;i<n;i++){
            ans[j++] = arr[i];
        }
        for(int i=0;i<n-k;i++){
            ans[j++] = arr[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array :");
        int n = sc.nextInt();
        System.out.println("Enter the value of k i.e no of rotations :");
        int k = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements of an array :");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Original Array is :");
        printFromArray(array);
        System.out.println();
        int [] ans = rotate(array,k);
        System.out.println("The k times rotated array is:");
        printFromArray(ans);
    }
}
