package AssignmentQuestions;

import java.util.Scanner;

public class PrimeNumberSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int x = sc.nextInt();
        int a = 0;
        if(x==1){
            System.out.print("Neither Prime nor Composite");
        }
        if(a==1){
            System.out.print("Composite number");
        }
        else{
            System.out.print("Prime number");
        }
    }
}
