package Questions;

import java.util.Scanner;

public class ReversingAnArray {
    static void reversingArray(int[] array){
        System.out.println("The Reversed Array is :");
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j< array.length;j++){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
            }
            System.out.print(array[i]+" ");
        }
        System.out.println();
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
        reversingArray(array);
    }
}
