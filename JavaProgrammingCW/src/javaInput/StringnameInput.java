package javaInput;
import java.util.Scanner;
public class StringnameInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter first name :");
//        String firstname=sc.next();
//        System.out.println("Enter last name :");
//        String lastname=sc.next();
//        System.out.println("The name is :"+firstname+" "+lastname);
        System.out.println("Enter name :");
        String name=sc.nextLine();
        System.out.println("The name is :"+name);
    }
}
