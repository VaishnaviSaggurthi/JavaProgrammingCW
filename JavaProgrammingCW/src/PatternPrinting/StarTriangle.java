package PatternPrinting;

import java.util.Scanner;
public class StarTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.of rows :");
        int rows = sc.nextInt();
//        System.out.println("Enter no.of columns :");
//        int columns = sc.nextInt();
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
