package ArrayManipulation;

import java.util.Scanner;

public class SecondMaxElement_Meth3 {
    static int findMaxElement(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }
    static int findSecondMaxElement(int[] array){
        int maximum = findMaxElement(array);
        for(int i=0;i<array.length;i++){
            if(maximum==array[i]){
                array[i]=Integer.MIN_VALUE;
            }
        }
        int secondMaximum = findMaxElement(array);
        System.out.println("The Second Maximum Element is :"+secondMaximum);
        return secondMaximum;

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
        findSecondMaxElement(array);
    }
}