package ArrayList.Problems.AssignmentQuestions;

import java.util.ArrayList;
import java.util.Scanner;

public class SwappingElementsInTheGivenRange {
    static void swapElements(ArrayList<Integer> l1,int i,int j){
        if(l1.size()<i || l1.size()<j){
            System.out.println("Enter Valid Positions");
            return;
        }
        if(i<j){
            Integer temp = Integer.valueOf(l1.get(i));
            l1.set(i,l1.get(j));
            l1.set(j,temp);
        }
        else{
            Integer temp = Integer.valueOf(l1.get(j));
            l1.set(j,l1.get(i));
            l1.set(i,temp);
        }
        System.out.println("Swapped Array List is :"+l1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of an array list :");
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter the elements of an array list :");
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        System.out.println("Enter the range of indexes to be swapped :");
        int i = sc.nextInt(); // [ --> included
        int j = sc.nextInt(); // [ --> included
        System.out.println("Original Array List is :"+list);
        swapElements(list,i,j);
    }
}
