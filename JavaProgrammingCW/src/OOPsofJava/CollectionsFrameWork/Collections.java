package OOPsofJava.CollectionsFrameWork;

import java.util.*;

public class Collections {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(4);
        list1.add(7);
        list1.add(6);
        list1.add(8);
        System.out.println("The ArrayList is :"+list1);
        List<Integer> list2 = new LinkedList<>();
        list2.add(45);
        list2.add(55);
        list2.add(64);
        list2.add(87);
        System.out.println("The JavaDSA.LinkedList is :"+list2);
        List<Integer> vector = new Vector<>();
        vector.add(78);
        vector.add(67);
        vector.add(56);
        vector.add(82);
        System.out.println("The Vector is :"+vector);
    }
}
