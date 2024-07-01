package TwoDimensionArrays;

import java.util.Scanner;

public class SpiralOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of rows :");
        int m = sc.nextInt(); // rows size
        System.out.println("Enter the size of columns :");
        int n = sc.nextInt(); // columns size
        // Creating a 2D Array
        int [][]  array = new int[m][n];
        System.out.println("Enter the  elements of an array :");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                array[i][j]= sc.nextInt();
            }
        }
        int totalElements = m*n; // If m=5,n=5 then totalElements = 25 --> (m*n)
        int min_r = 0;   // minimum row
        int max_r = m-1; // maximum row
        int min_c = 0;   // minimum column
        int max_c = n-1; // maximum column
        int count = 0;
        while(count<totalElements){
            // Printing Minimum Row
            for(int j=min_c;j<=max_c && count<totalElements ;j++){
                System.out.print( array[min_r][j] + " ");
                count++;
            }
            min_r++;
            // Printing Maximum Column
            for(int i=min_r;i<=max_r && count<totalElements ;i++) {
                System.out.print( array[i][max_c] + " ");
                count++;
            }
            max_c--;
            // Printing Maximum Row
            for(int j=max_c;j>=min_c && count<totalElements ;j--){
                System.out.print(array[max_r][j]+ " ");
                count++;
            }
            max_r--;
            // Printing Minimum Column
            for(int i=max_r;i>=min_r && count<totalElements ;i--){
                System.out.print(  array[i][min_c] + " ");
                count++;
            }
            min_c++;
        }
    }
}
