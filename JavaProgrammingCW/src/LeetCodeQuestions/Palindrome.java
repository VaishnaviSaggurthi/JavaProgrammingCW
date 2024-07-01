package LeetCodeQuestions;

import java.util.Scanner;

public class Palindrome {
    public boolean isPalindrome(int[] arr){
        int n = arr.length;
        for(int i=0,j=n-1;i<j;i++,j--){
            if(arr[i]!=arr[j]){
                System.out.print(false);
                return false;
            }
        }
        System.out.print(true);
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array :");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements of an array :");
        for(int i=0;i<n;i++){
            array[i]= sc.nextInt();
        }
        Palindrome object = new Palindrome();
        System.out.println("Is it a  palindrome :");
        object.isPalindrome(array);
    }
}
