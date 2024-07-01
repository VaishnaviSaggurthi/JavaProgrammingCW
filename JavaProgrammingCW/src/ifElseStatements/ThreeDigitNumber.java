package ifElseStatements;
import java.util.Scanner;
public class ThreeDigitNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int number = sc.nextInt();
        if(number>99 && number<1000){
            System.out.println("The given number is three digit number");
        }
        else{
            System.out.println("The given number is not a three digit number");
        }
    }
}
