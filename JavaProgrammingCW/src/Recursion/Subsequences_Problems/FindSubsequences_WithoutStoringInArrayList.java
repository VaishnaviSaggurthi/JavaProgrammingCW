package Recursion.Subsequences_Problems;

import java.util.Scanner;

public class FindSubsequences_WithoutStoringInArrayList {
    static void subsequences(String s,String currSubsequence){ // s="abc" , currSubsequence=" "
        if(s.length()==0){
            System.out.println(currSubsequence);
            return;
        }
        char currChar = s.charAt(0); // a
        String remString = s.substring(1); // bc
        // currChar --> Chooses to be a part of currSubsequence
        subsequences(remString,currSubsequence+currChar); // bc,a --> add currChar
        // currChar --> Chooses not to be a part of currSubsequence
        subsequences(remString,currSubsequence); // bc --> do not add currChar
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the string :");
        String s = sc.nextLine();
        System.out.printf("The subsequences of %s is :",s);
        System.out.println();
        subsequences(s," ");
    }
}
