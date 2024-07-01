package HackerRankQuestions;

import java.util.Scanner;

public class TablesOfAGivenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = scanner.nextInt();
        int j = 1;
        for (int i = n; i <= n * 10; i = i + n) {
            System.out.println(n + " * " + (j++) + " = " + i);
        }
    }
}
