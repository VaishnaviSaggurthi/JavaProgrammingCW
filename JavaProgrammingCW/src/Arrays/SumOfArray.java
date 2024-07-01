package Arrays;

public class SumOfArray {
    public static void main(String[] args) {
        int[] array = {1, 3, 4, 5};
        int sum =0;
        for (int i = 0; i < array.length;i++){
               sum += array[i];
        }
        System.out.println("The Sum of given array is :"+sum);
    }
}
