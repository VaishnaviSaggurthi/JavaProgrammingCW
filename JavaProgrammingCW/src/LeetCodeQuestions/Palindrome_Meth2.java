package LeetCodeQuestions;

import java.util.Scanner;

public class Palindrome_Meth2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = sc.nextInt();
        int enteredValue=n;
        int r=0;
       while(n!=0){
            r=r*10;
            r=r+(n%10);
            n=n/10;
        }
        System.out.println("Is it a palindrome :");
        if(enteredValue==r&& enteredValue>0){
            System.out.print(true);
        }
        else{
            System.out.print(false);
        }
    }
}
