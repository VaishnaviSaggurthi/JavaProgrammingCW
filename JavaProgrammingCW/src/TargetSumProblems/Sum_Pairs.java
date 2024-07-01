package TargetSumProblems;

import java.util.Scanner;

public class Sum_Pairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int n = sc.nextInt(); // HERE n --> size of the array
        int[] array = new int[n];
        System.out.println("Enter the elements of the array :");
        for(int i=0;i<array.length;i++){
            array[i] = sc.nextInt();
        }
        System.out.println("Enter the target element :");
        int target = sc.nextInt();
        int pairs = 0;
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j< array.length;j++){
              if(target==array[i]+array[j]){
                  pairs++;
              }
            }
        }
        System.out.print("The total no. of pairs are :"+pairs);
    }
}
