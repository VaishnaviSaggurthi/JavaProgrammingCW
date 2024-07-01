package Arrays;

import java.util.Scanner;

public class TakingInputOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array :");
        int n= sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter "+n+" elements :");
        for(int i=0;i<array.length;i++){
            array[i] = sc.nextInt();
        }
        System.out.println("The Elements of the array are :");
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
}
