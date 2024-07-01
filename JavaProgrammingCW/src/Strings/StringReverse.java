package Strings;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String :");
        String str = sc.nextLine();
        int i=0,j=str.length()-1;
        boolean flag = true;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                flag = false;
                break;
            }
            i++;
            j--;
        }
        if(flag==true){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
    }
}
