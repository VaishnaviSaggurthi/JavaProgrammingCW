package TwoDimensionArrays;

import java.util.Scanner;

public class AdditionOfMatrices {
    static void sumOfMatrices(int [][] array,int r1,int c1,int[][] array2,int r2,int c2){
      if(r1!=r2 || c1!=c2 ){
          System.out.println("Wrong Input - Addition is not possible");
          return;
      }
      else {
          int[][] sum = new int[r1][c1];
          for (int i = 0; i < r1; i++) { // row number
              for (int j = 0; j < c1; j++) { // column number
                  sum[i][j] = array[i][j] + array2[i][j];
              }
          }
          for (int i = 0; i < r1; i++) {
              for (int j = 0; j < c1; j++) {
                  System.out.print(sum[i][j] + " ");
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
        int [][] array = new int[r1][c1];
        System.out.println("Enter the elements of 1st matrix :");
        for(int i=0;i< r1;i++){
            for(int j=0;j<c1;j++){
                array[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter no. of rows of 2nd matrix :");
        int r2 = sc.nextInt();
        System.out.println("Enter no. of columns of 2nd matrix :");
        int c2 = sc.nextInt();
        int [][] array2 = new int[r2][c2];
        System.out.println("Enter the elements of 2nd matrix :");
        for(int i=0;i< r2;i++){
            for(int j=0;j<c2;j++){
                array2[i][j]=sc.nextInt();
            }
        }
        System.out.println("The Sum of two matrices is :");
        sumOfMatrices(array,r1,c1,array2,r2,c2);
    }
}
