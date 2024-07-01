package loopsOfjava;
import java.util.Scanner;
public class whileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number=1;
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        while(number<=n){
            System.out.println(number);
            number++;
        }
    }
}
