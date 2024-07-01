package Strings;

import java.util.Scanner;

public class StringReverseUsingStringBuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String :");
        String str = sc.nextLine();
        StringBuilder gtr = new StringBuilder(str);
        String s = gtr+""; // to convert string builder to string
        if(str.equals(s)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
    }
}
