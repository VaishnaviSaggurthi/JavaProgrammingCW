package ifElseStatements;
import java.util.Scanner;
public class evenodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int num;
        num = sc.nextInt();
        if(num%2==0){ // num is even
            System.out.println("The Number is Even");
        }
        else{ // num is odd
            System.out.println("The Number is Odd");
        }
    }
}
