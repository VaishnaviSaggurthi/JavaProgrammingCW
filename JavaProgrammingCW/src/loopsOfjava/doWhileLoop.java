package loopsOfjava;
import java.util.Scanner;
public class doWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = sc.nextInt();
        int number =1;
        do{
            System.out.println(number);
            number++;
        }while(number<=n);
    }
}
