package Arrays;

public class ArrayReference2 {
    static void changeArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            arr[i] = 0;
        }
    }
    static void changeValue(int a){
        a = 100;
    }
    public static void main(String[] args) {
        int a = 5;
        changeValue(a);
        System.out.println(a); // 5
        int [] array = new int[3];
        array[0]=5;
        array[1]=6;
        array[2]=7;
        System.out.println("Original Array is :");
        for(int i=0;i< array.length;i++) {
            System.out.println(array[i]+" ");
        }
        changeArray(array);
        System.out.println("Changed Array is :");
        for(int i=0;i<array.length;i++) {
            System.out.println(array[i]+" ");
        }
    }
}
