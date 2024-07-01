package LeetCodeQuestions;

import java.util.Scanner;

public class FirstOccurrenceOfAString {
    public int strStr(String haystack,String needle){
       if(haystack.contains(needle)){
           return haystack.indexOf(needle);
       }
    return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter haystack string :");
        String haystack = sc.next();
        System.out.println("Enter needle string :");
        String needle = sc.next();
        FirstOccurrenceOfAString object = new FirstOccurrenceOfAString();
        System.out.println("Index is :"+object.strStr(haystack,needle));
    }
}
