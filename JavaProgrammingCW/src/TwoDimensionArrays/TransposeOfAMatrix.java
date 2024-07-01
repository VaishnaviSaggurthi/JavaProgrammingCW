package TwoDimensionArrays;

import java.util.Scanner;

public class TransposeOfAMatrix {
    static void transposeOfMatrix(int[][] arr,int[][] brr,int r,int c){
       for(int i=0;i<r;i++){
           for(int j=0;j<c;j++){
               brr[j][i]=arr[i][j];
           }
       }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(brr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows of a matrix :");
        int r = sc.nextInt();
        System.out.println("Enter no. of columns of a matrix :");
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        System.out.println("Enter the elements of a matrix :");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int[][] brr = new int[r][c];
        System.out.println("The Transpose of given matrix is :");
        transposeOfMatrix(arr,brr,r,c);
    }
}
