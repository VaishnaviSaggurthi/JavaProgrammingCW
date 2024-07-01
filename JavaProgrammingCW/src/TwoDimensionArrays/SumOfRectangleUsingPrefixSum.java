package TwoDimensionArrays;

import java.util.Scanner;
public class SumOfRectangleUsingPrefixSum {
    static void finPrefixSum(int[][] matrix){
        int r = matrix.length;
        int c = matrix[0].length;
        // Traversing horizontally t0 calculate row wise prefix sum
        for(int i=0;i<r;i++){
            for(int j=1;j<c;j++){
                matrix[i][j]+=matrix[i][j-1]; // if j=0 then error occurs bcz 0-1=-1
            }
        }
    }
    static int findSum(int[][] matrix,int l1,int r1,int l2,int r2){
        finPrefixSum(matrix);
        int sum=0;
        for(int i=l1;i<=l2;i++) {
            // r1 to r2 sum for i
            if (r1 > 0) {
                sum += matrix[i][r2] - matrix[i][r1 - 1];
            } else {
                sum += matrix[i][r2];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of rows :");
        int n = sc.nextInt(); // rows size
        System.out.println("Enter the size of columns :");
        int m = sc.nextInt(); // columns size
        // Creating a 2D Array
        int[][] matrix = new int[n][m];
        System.out.println("Enter the  elements of an array :");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the co-ordinates l1,r1 :");
        // Co-Ordinates (l1,r1) (l2,r2)
        int l1 = sc.nextInt();
        int r1 = sc.nextInt();
        System.out.println("Enter the co-ordinates l2,r2 :");
        int l2 = sc.nextInt();
        int r2 = sc.nextInt();
        System.out.println("The Sum of given rectangle is :"+findSum(matrix,l1,r1,l2,r2));

    }
}
