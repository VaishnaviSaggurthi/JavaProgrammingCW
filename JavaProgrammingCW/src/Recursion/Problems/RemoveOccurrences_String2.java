package Recursion.Problems;

import java.util.Scanner;

public class RemoveOccurrences_String2 {
    static String removeA(String s){
        int n=s.length();
        // Base Case
        if(n==0) return " ";
        // Recursive Work
        String smallAns = removeA(s.substring(1));
        char currChar = s.charAt(0);
        // Self Work
        if(currChar !='a') return currChar+smallAns;
        else return smallAns;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String :");
        String s = sc.nextLine();
        System.out.println("The String after removal of a's is :"+removeA(s));
    }
}
