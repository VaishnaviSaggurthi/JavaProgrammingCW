package TwoDimensionArrays;

import java.util.Scanner;

public class SpiralOrderWithoutEnteringElements {
    static void printArray(int[][] arr){
        for(int i=0;i< arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array :");
        int n = sc.nextInt(); //  size
        // Creating a 2D Array
        int [][]  array = new int[n][n];
        int totalElements = n*n; // If m=5,n=5 then totalElements = 25 --> (n*n)
        int min_r = 0;   // minimum row
        int max_r = n-1; // maximum row
        int min_c = 0;   // minimum column
        int max_c = n-1; // maximum column
        int current=1;
        while(current<=totalElements){
            // Printing Minimum Row
            for(int j=min_c;j<=max_c && current<=totalElements ;j++){
                array[min_r][j]=current;
               current++;
            }
            min_r++;
            // Printing Maximum Column
            for(int i=min_r;i<=max_r && current<=totalElements ;i++) {
                array[i][max_c]=current;
                current++;
            }
            max_c--;
            // Printing Maximum Row
            for(int j=max_c;j>=min_c && current<=totalElements ;j--){
                array[max_r][j]=current;
                current++;
            }
            max_r--;
            // Printing Minimum Column
            for(int i=max_r;i>=min_r && current<=totalElements ;i--){
                array[i][min_c]=current;
                current++;
            }
            min_c++;
        }
        System.out.println("The Spiral Ordered Array is:");
        printArray(array);
    }
}
