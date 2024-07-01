package TargetSumProblems;

import java.util.Scanner;

public class FirstValueOfRepeatingElements {
    static int firstRepeatingNumber(int[] array){
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i]==array[j]){
                    return array[i];
                }
            }
        }
        return -1;
    }
    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array :");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements of an array :");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        firstRepeatingNumber(array);
        System.out.println("The Number that repeated twice is :"+firstRepeatingNumber(array));
    }
}
