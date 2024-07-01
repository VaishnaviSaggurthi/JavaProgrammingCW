package TwoDimensionArrays;

import java.util.Scanner;

public class PascalTriangle_Meth2 {
    static void printMatrix(int[][] matrix){
        for(int i=0;i< matrix.length;i++){
            for(int k=0;k< matrix.length-i;k++){
                System.out.print(" ");
            }
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    static int[][] pascal(int n){
        int [][] answer = new int[n][];
        for(int i=0;i<n;i++){
          // ith row has (i+1) columns
          /*
          answer[0]  = new int[1]
          answer[1]  = new int[2]
           */
          answer[i] = new int[i+1];
          answer[i][0] =answer[i][i]=1;
            for(int j=1;j<i;j++){
            answer[i][j] = answer[i-1][j] + answer[i-1][j-1];
            }
        }
       return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of lines :");
        int n = sc.nextInt();
        int [][] ans = pascal(n);
        printMatrix(ans);
    }

}
