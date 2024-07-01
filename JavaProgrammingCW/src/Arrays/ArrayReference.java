package Arrays;

public class ArrayReference {
    static void printFromArray(int[] array){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] array = new int[5];
        array[0]=5;
        array[1]=6;
        array[2]=7;
        array[3]=8;
        array[4]=9;
        System.out.println("Original Array is :");
        printFromArray(array);
        int[] array_2 = array; // Shallow Copy
        System.out.println("Copied Array is :");
        printFromArray(array_2);
        array_2[0]=0;
        array_2[1]=0;
        System.out.println("Original Array after changing the values of array_2 ");
        printFromArray(array);
        System.out.println("Copied Array after changing the values of array_2 ");
        printFromArray(array_2);
    }
}
