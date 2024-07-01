package ArrayManipulation;

import java.util.Scanner;

public class UniqueElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int n = sc.nextInt(); // HERE n --> size of the array
        int[] array = new int[n];
        System.out.println("Enter the elements of the array :");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        int unique = -1;
        for (int i = 0; i < array.length; i++) {
           for(int j=i+1;j< array.length;j++){
               if(array[i]==array[j]){
                   array[i]=-1;
                   array[j]=-1;
               }
               if(array[i]>0){
                   unique = array[i];
               }
           }
        }
        System.out.println("The Unique Element is :"+unique);
    }
}
