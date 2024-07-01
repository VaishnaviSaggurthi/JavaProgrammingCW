package PatternPrinting;

import java.sql.SQLOutput;
import java.util.Scanner;

public class VarietyNumberTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.of rows :");
        int rows = sc.nextInt();
//        System.out.println("Enter no.of columns :");
//        int columns = sc.nextInt();
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=rows-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(k);
            }
            for(int p=1;p<=i-1;p++){
                System.out.print(p);
            }
            System.out.println(" ");
        }
    }
}
