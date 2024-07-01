package Recursion.Problems;

import java.util.Scanner;

public class RemoveOccurrences_String {
    static String removeA(String s,int index){
        int n=s.length();
        // Base Case
        if(index==n) return " ";
        // Recursive Work
        String smallAns = removeA(s,index+1);
        char currChar = s.charAt(index);
        // Self Work
        if(currChar !='a') return currChar+smallAns;
        else return smallAns;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String :");
        String s = sc.nextLine();
        int index = 0;
        System.out.println("The String after removal of a's is :"+removeA(s,index));
    }
}
