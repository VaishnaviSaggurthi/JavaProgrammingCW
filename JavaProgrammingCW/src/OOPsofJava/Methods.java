package OOPsofJava;
import java.util.Scanner;
public class Methods {
    public int sum(int a,int b){
        int answer = a+b;
        System.out.println("The Sum of given numbers is :"+answer);
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x:");
        int x = sc.nextInt();
        System.out.println("Enter the value of y:");
        int y = sc.nextInt();
        Methods add = new Methods();
        add.sum(x,y);
    }
}