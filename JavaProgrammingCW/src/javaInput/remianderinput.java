package javaInput;
import java.util.Scanner;
public class remianderinput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of first number :");
        int dividend = sc.nextInt();
        System.out.println("Enter the value of second number :");
        int divisor = sc.nextInt();
        int quotient=dividend/divisor;
       int remainder=dividend-(divisor*quotient); // Formula --> dividend = divisor * quotient + remainder
        // remainder = dividend %  divisor
        System.out.println("The remainder for the given values is :"+remainder);


    }
}
