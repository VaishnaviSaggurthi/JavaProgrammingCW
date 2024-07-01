package javaInput;
import  java.util.Scanner;
public class charInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string :");
        // Taking A String and chopping the character what we want
        char ch=sc.next().charAt(2); // charAt(2)--> 2 is index
        System.out.println("The 3rd character is :"+ch);
    }
}
