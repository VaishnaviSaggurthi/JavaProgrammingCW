package Arrays;

import java.util.Arrays;

public class ThirdWayOfCloning {
    static void printFromArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = new int[5];
        array[0] = 5;
        array[1] = 6;
        array[2] = 7;
        array[3] = 8;
        array[4] = 9;
        System.out.println("Original Array is :");
        printFromArray(array);
        /* imp */                                  // [    )
        int[] array_2 = Arrays.copyOfRange(array, 1, 4); // Deep Copy
        System.out.println("Copied Array is :");
        printFromArray(array_2);
    }
}
