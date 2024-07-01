package TwoDimensionArrays;

import java.util.Scanner;

public class PascalTriangle {
    static int factorial(int x){
        int factorial = 1;
        for(int i=2;i<=x;i++){
            factorial*=i;
        }
        return factorial;
    }
    static int combination(int n,int r){
        int nCr = factorial(n) / (factorial(r) * factorial(n - r));  // nCr = n!/(r! * (n-r)!)
        return nCr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of lines :");
        int n = sc.nextInt();
        for(int i=0;i<=n;i++){ // rows
            for(int k=0;k<=n-i;k++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++) {  // columns
                int iCj = combination(i,j);
                System.out.print(iCj+" ");
            }
            System.out.println();
        }

    }
}
