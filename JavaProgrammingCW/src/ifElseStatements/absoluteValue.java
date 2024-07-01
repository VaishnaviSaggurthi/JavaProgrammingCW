package ifElseStatements;
import java.util.Scanner;
public class absoluteValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = sc.nextInt();
        if(number<0){  // Ex: |-20|=20
            number*=-1;
            System.out.println("The Absolute Value of given number is :"+number);
        }
        else{
            System.out.println("The Absolute Value of given number is :"+number);
        }
    }
}
