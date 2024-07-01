package TwoDimensionArrays;

import java.util.Scanner;

public class ClockWise90Degrees {
    static void clockWise90Degrees(int[][] arr,int r,int c){
        // Condition Valid Only for Square Matrices Not Possible for Rectangular Matrices
        for(int i=0;i<r;i++){ // rows
            for(int j=0;j<i;j++){ // columns
                int temp =arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        // Transposing Matrix
        for (int i = 0; i <r; i++) {
            int j=0;
            int k=r-1;
            int temp =arr[i][j];
            arr[i][j]=arr[i][k];
            arr[i][k]=temp;
            j++;
            k--;
        }
        // Reversing the transpose matrix
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j]+" ");
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
        int[][] array = new int[r][c];
        System.out.println("Enter the elements of a matrix :");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                array[i][j] = sc.nextInt();
            }
        }
        System.out.println("The transpose of given matrix is :");
        clockWise90Degrees(array,r,c);
    }
}
