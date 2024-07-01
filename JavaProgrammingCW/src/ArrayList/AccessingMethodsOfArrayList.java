package ArrayList;

import java.util.ArrayList;

public class AccessingMethodsOfArrayList {
    public static void main(String[] args) {
        // Creating Array List
        ArrayList<Integer> l1 = new ArrayList<>();
        // In this Array List we can access only integers bcz we wrote Integer class(Wrapper Class)
        // Accessing Methods in array List
        // 1. Add New Element
        l1.add(5);
        l1.add(3);
        l1.add(4);
        l1.add(7); // Now in the array list we have 4 elements
        // 2. Get an element at index i
        System.out.println(l1.get(0)); // Outputs 5 [ In Arrays we will access like arr[0] , arr[1] etc. ]
        // 3. Print with for loop
        for(int i=0;i< l1.size();i++){
            System.out.print(l1.get(i)+" "); // Outputs 5 3 4 7
        }
        System.out.println();
        // 4. Printing the array list directly
        System.out.println(l1); // [5,3,4,7]
        // 5. Adding Elements at some index i
        l1.add(3,6);
        System.out.println(l1); // [5,3,4,6,7]
        // 6. Modifying Elements at index i
        l1.set(1,10);
        System.out.println(l1); // [5,10,4,6,7]
        // 7. Removing An Element at index i
        l1.remove(2);
        System.out.println(l1); // [5,10,6,7]
        // 8. Removing an Element e that is we don't know index or
        System.out.println( l1.remove(Integer.valueOf(12)));
        // returns boolean that is  the given element is present in the list or not
        l1.remove(Integer.valueOf(5));
        System.out.println(l1); // [10,6,7]
        // 9. Checking if an element exists
        boolean ans = l1.contains(Integer.valueOf(6  ));
        System.out.println(ans);
        // 10. If you don't specify any class , you can put anything inside the list l
        // That Means you can add string or float type or int type etc.
        ArrayList l = new ArrayList();
        l.add("Physics");
        l.add(4);
        l.add(3.14f);
        System.out.println(l);
        // 11. Accessing index of a particular element prints first occurrence of an element
        System.out.println( l1.indexOf(7));
        System.out.println( l1.indexOf(2));
        l1.add(7);
        // 12. Accessing index of a particular element prints last occurrence of an element
        System.out.println( l1.lastIndexOf(7));
    }
}
