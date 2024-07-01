package ArrayList.Problems.AssignmentQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class PrintOnlyPositiveIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of an array :");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements of an array :");
        for (int i = 0; i < n; i++) {
           array[i]= sc.nextInt();
        }
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Positive Numbers Array is :");
        for(int i=0;i<n;i++){
            if(array[i] >= 0){
                list.add(array[i]);
            }
        }
        if(list.size() == 0){
            System.out.println("NA");
            return;
        }
        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
    }
}
