package javaInput;
import java.util.Scanner;
public class squareOfinput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of x:");
        int x=sc.nextInt();
        int y=x*x;
        System.out.println("The square of number that you gave is :"+y);

    }
}
