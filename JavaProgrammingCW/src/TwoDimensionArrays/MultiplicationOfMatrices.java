package TwoDimensionArrays;

import java.util.Scanner;

public class MultiplicationOfMatrices {
    static void multiplicationMatrix(int[][] a ,int r1,int c1,int[][] b,int r2,int c2 ){
        if(c1!=r2){
            System.out.println("Multiplication is not possible - Wrong Dimensions");
            return ;
        }
        else{
            int [][] mul = new int[r1][c2];
            for(int i=0;i<r1;i++){
                for(int j=0;j<c2;j++){
                    mul[i][j] = 0;
                    for(int k=0;k<c1;k++){
                        mul[i][j] += (a[i][k] * b[k][j]);
                    }
                }
            }
            for(int i=0;i<r1;i++){
                for(int j=0;j<c2;j++){
                    System.out.print(mul[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows of 1st matrix :");
        int r1 = sc.nextInt();
        System.out.println("Enter no. of columns of 1st matrix :");
        int c1 = sc.nextInt();
        int[][] array = new int[r1][c1];
        System.out.println("Enter the elements of 1st matrix :");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                array[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter no. of rows of 2nd matrix :");
        int r2 = sc.nextInt();
        System.out.println("Enter no. of columns of 2nd matrix :");
        int c2 = sc.nextInt();
        int[][] array2 = new int[r2][c2];
        System.out.println("Enter the elements of 2nd matrix :");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                array2[i][j] = sc.nextInt();
            }
        }
        System.out.println("The Multiplication of two matrices is :");
        multiplicationMatrix(array,r1,c1,array2,r2,c2);
    }
}
