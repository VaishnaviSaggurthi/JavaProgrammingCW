package loopsOfjava;
import java.util.Scanner;
public class forLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n :");
        int n = sc.nextInt();
        int sum=0;
        // Code for first n natural numbers
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        System.out.println("The Sum of first n natural numbers is :"+sum);
    }
}
