package Recursion.Problems;

import java.util.*;

public class ReverseTheString {
    static String reverseString(String s,int index){
        int n=s.length();
        // Base Case
        if(index==n) return " ";
        // Recursive Work
       return  reverseString(s,index+1) + s.charAt(index);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the string :");
        String s = sc.nextLine();
        int index = 0;
        System.out.println("The Reversed  String is :"+reverseString(s,index));
    }
}
