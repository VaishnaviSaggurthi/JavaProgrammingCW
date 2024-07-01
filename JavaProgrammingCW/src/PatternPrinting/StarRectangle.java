package PatternPrinting;

import java.util.Scanner;

public class StarRectangle {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter no. of rows :");
            int rows =sc.nextInt();
            System.out.println("Enter no. of columns :");
            int columns =sc.nextInt();
            for(int i=1;i<=rows;i++){  // Here i --> no.of rows
                for(int j=1;j<=columns;j++){ // Here j --> no.of columns
                    System.out.print("* ");
                }
                System.out.println(" ");
            }
    }

}
