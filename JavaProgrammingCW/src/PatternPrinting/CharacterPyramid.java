package PatternPrinting;

import java.util.Scanner;

public class CharacterPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows :");
        int rows = sc.nextInt();
        for(int i=1;i<=rows;i++){
            int a = 65;
            for(int j=1;j<=rows-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                char ch =(char)a;
                System.out.print(ch);
                a++;
            }
            for(int p=1;p<=i-1;p++){
                char ch1 = (char)a;
                System.out.print(ch1);
                a++;
            }
            System.out.println(" ");
        }
    }
}
