package Strings;
import java.util.*;
public class BuiltInFunctions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string 1:");
        String str1 = sc.nextLine();
        System.out.println("Enter string 2:");
        String str2 = sc.nextLine();
        System.out.println(str1.indexOf('a'));
        System.out.println(str2.charAt(5));
        System.out.println(str1.toLowerCase());
        System.out.println(str2.toUpperCase());
        System.out.println(str1.concat(str2));
        System.out.println(str1.length());
        System.out.println(str1.compareTo(str2));
        System.out.println(str1.startsWith("abc"));
        System.out.println(str2.endsWith("lah"));
    }
}
