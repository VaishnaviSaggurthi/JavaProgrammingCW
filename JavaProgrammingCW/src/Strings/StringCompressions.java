package Strings;

import java.util.Scanner;

public class StringCompressions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string :");
        String str = sc.nextLine(); // aaabbbbccdddee
        String ans = ""+str.charAt(0); // a
        int count=1;
        for(int i=1;i<str.length();i++){
            char curr = str.charAt(i);
            char prev = str.charAt(i-1);
            if(curr==prev){
                count++;
            }
            else{
                if(count>1) ans+=count; // a3
                ans+=curr; // a3b
                count=1;
            }
        }
        if(count>1) ans+=count;
        System.out.println(ans);
    }
}
