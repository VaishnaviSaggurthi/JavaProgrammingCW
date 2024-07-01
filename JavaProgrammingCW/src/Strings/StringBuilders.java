package Strings;

import java.util.Scanner;

public class StringBuilders {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" Friend");
        System.out.println(sb);
        sb.setCharAt(6,'P');
        System.out.println(sb);
        sb.deleteCharAt(5);
        System.out.println(sb);
        sb.insert(5,'S');
        System.out.println(sb);
        System.out.println(sb.reverse());
        sb.reverse();
        sb.delete(0,6);
        System.out.println(sb);
        sb.setCharAt(0,'F');
        System.out.println(sb);
    }
}
