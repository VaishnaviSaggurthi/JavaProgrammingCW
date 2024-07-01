package Recursion.Problems;

import java.util.Scanner;

public class StringIsPalindromeOrNot {
    static String reverseString(String s,int index){
        int n=s.length();
        // Base Case
        if(index==n) return " ";
        // Recursive Work
        String smallAns = reverseString(s,index+1);
        // Self Work
        return  smallAns + s.charAt(index);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the string :");
        String s = sc.nextLine();
        int index = 0;
        String rev = reverseString(s,index);
        if(rev.equals(s)){
            System.out.printf("%s is a Palindrome",s);
        }
        else{
            System.out.printf("%s is not a Palindrome",s);
        }
    }
}
