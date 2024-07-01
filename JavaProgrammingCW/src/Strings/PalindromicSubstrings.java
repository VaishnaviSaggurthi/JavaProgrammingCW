package Strings;

import java.util.Scanner;

public class PalindromicSubstrings {
    static boolean isPalindrome(String s){
        int i=0,j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string :");
        String str = sc.nextLine();
        int count=0;
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<=str.length();j++){

                if(isPalindrome(str.substring(i,j))) {
                    System.out.print(str.substring(i,j)+" ");
                    count++;
                }
            }
        }
        System.out.println();
        System.out.println("The Count Of Palindromic Substrings are :"+count);
    }
}
