package ArrayList.Problems;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseAnArrayList_2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(10);
        list.add(3);
        list.add(5);
        list.add(22);
        list.add(10);
        System.out.println("Original Array List is :"+list);
        Collections.reverse(list);
        System.out.println("Reversed Array List is :"+list);
        Collections.sort(list);
        System.out.println("Ascending Order Array List is :"+list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println("Descending Order Array List is :"+list);
    }
}
