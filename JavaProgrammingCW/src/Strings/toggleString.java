package Strings;

import java.util.Scanner;

public class toggleString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String :");
        String str = sc.nextLine();
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
                str = str.substring(0,i)+dh+str.substring(i+1);
            }
            else {
                ascii -= 32;
                char dh = (char) ascii;
                str = str.substring(0,i)+dh+str.substring(i+1);
            }
        }
        System.out.println("After Toggle Case :"+str);
    }
}
