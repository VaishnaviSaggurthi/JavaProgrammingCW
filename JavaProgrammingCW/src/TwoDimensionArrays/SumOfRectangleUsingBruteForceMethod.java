package TwoDimensionArrays;

import java.util.Scanner;

public class SumOfRectangleUsingBruteForceMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of rows :");
        int n = sc.nextInt(); // rows size
        System.out.println("Enter the size of columns :");
        int m = sc.nextInt(); // columns size
        // Creating a 2D Array
        int[][] array = new int[n][m];
        System.out.println("Enter the  elements of an array :");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the co-ordinates l1,r1 :");
        // Co-Ordinates (l1,r1) (l2,r2)
        int l1 = sc.nextInt();
        int r1 = sc.nextInt();
        System.out.println("Enter the co-ordinates l2,r2 :");
        int l2 = sc.nextInt();
        int r2 = sc.nextInt();
        int sum=0;
        for(int i=l1;i<=l2;i++){
            for(int j=r1;j<=r2;j++){
                sum+=array[i][j];
            }
        }
        System.out.print("The Sum is :"+sum);
    }
}

