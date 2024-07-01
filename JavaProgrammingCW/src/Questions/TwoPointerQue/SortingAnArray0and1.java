package Questions.TwoPointerQue;

import java.util.Scanner;
public class SortingAnArray0and1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array :");
        int n = sc.nextInt();
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
        int index=0;
        int[] array2 = new int[n];
        for(int i=0;i<array.length;i++){
            if(array[i]==0){
                array2[i]=array[i];
                index++;
            }
        }
        while(index!=array.length){
            array2[index] = 1;
            index++;
        }
        System.out.println("Sorted Array is :");
        for(int i=0;i< array.length;i++){
            System.out.print(array2[i]+" ");
        }
    }
}
