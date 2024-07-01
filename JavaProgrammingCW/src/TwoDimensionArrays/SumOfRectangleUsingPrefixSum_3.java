package TwoDimensionArrays;

import java.util.Scanner;

public class SumOfRectangleUsingPrefixSum_3 {
    static void finPrefixSum(int[][] matrix){
        int r = matrix.length;
        int c = matrix[0].length;
        // Traversing horizontally to calculate row wise prefix sum
        for(int i=0;i<r;i++){ // fixing rows
            for(int j=1;j<c;j++){
                matrix[i][j]+=matrix[i][j-1]; // if j=0 then error occurs bcz 0-1=-1
            }
        }
        // Traversing vertically to calculate column wise prefix sum
        for(int j=0;j<c;j++){ // fixing columns
            for(int i=1;i<r;i++){
                matrix[i][j]+=matrix[i-1][j];
            }
        }
        // calculate row wise and column wise sum
        // sumOfRectangle[(0,0),(i,j)]
    }
    static int findSum(int[][] matrix,int l1,int r1,int l2,int r2){
        int ans=0,sum=0,up=0,left=0,leftUp=0;
        finPrefixSum(matrix);
        sum = matrix[l2][r2];
        if(l1>0) {
            up = matrix[l1 - 1][r2];
        }
        if(r1>0) {
            left = matrix[l2][r1-1];
        }
        if(l1>0 && r1>0){
            leftUp = matrix[l1-1][r1-1];
        }
        ans = sum-up-left+leftUp;
        return ans;
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
