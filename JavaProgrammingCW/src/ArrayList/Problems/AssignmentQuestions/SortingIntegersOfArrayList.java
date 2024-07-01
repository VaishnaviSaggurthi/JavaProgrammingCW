package ArrayList.Problems.AssignmentQuestions;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class SortingIntegersOfArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of an array list :");
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter the elements of an array list :");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        System.out.println("Original Array List is :" + list);
        Collections.sort(list);
        System.out.println("Sorted Array List is :" + list);
    }
}
