package Recursion.Problems;

import java.util.Scanner;

public class StringIsPalindromeOrNot_2 {
    static boolean isPalindrome(String s,int l,int r){
        int n=s.length();
        // Base Case
        if(l>=r) return true;
        // Recursive Work and Self Work
        return (s.charAt(l)==s.charAt(r)) && isPalindrome(s,l+1,r-1);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the string :");
        String s = sc.nextLine();
        int n=s.length();
        int l=0;
        int r=n-1;
        System.out.println("Is it a palindrome :"+isPalindrome(s,l,r));
    }
}
