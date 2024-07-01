package Strings;

import java.util.Scanner;

public class UppercaseLettersToLowercaseLetters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.nextLine()); // PHysICS
        System.out.println("Before Toggle Case :"+str); // PHysICS
        for(int i=0;i<str.length();i++){
            // P --> p
            // check --> alphabet --> small or capital
            boolean flag = true; // true --> capital
            char ch = str.charAt(i); // A
            if(ch==' ') continue;
            // skips space part and convert if we don't write this case then space will become @
            int ascii = (int)ch; // 65
            if(ascii>=97) {
                flag = false; // false --> small
            }
            if(flag==true){
                ascii+=32; // 97
                char dh =(char)ascii; // a
                str.setCharAt(i,dh);
            }
            else{
                ascii-=32;
                char dh =(char)ascii;
                str.setCharAt(i,dh);
            }
        }
        System.out.println("After Toggle Case :"+str);
    }
}
