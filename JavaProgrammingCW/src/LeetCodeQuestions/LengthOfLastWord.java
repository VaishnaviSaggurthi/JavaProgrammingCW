package LeetCodeQuestions;

import java.util.Scanner;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s){
        int n = s.length();
       return  n-s.lastIndexOf(' ')+1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of a string :");
        int n = sc.nextInt();
        String s = new String();
        System.out.println("Enter the string :");
        if(n<=10000 || n>=1){
            s = sc.next();
        }
        LengthOfLastWord obj = new LengthOfLastWord();
        System.out.println("The length of last word in string is :"+obj.lengthOfLastWord(s));
    }
}
