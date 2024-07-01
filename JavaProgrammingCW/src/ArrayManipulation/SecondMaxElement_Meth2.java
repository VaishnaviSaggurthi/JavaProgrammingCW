package ArrayManipulation;

import java.util.Scanner;

public class SecondMaxElement_Meth2 {
    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array :");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements of an array :");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        int max=Integer.MIN_VALUE;  // Maximum
        int s_max=Integer.MIN_VALUE; // Second Maximum
        for (int i = 0; i < array.length; i++) {
          if((max<array[i])&& (s_max<array[i])&&(max!=array[i])){
              s_max=max;
              max=array[i];
          }
        }
        System.out.println("The Second Maximum Element is :"+s_max);
    }
}
