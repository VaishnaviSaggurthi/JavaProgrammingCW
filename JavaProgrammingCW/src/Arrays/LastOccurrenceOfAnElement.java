package Arrays;
import java.util.Scanner;
public class LastOccurrenceOfAnElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array :");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements of an array :");
        for (int i = 0; i < array.length;i++){
            array[i] = sc.nextInt();
        }
        System.out.println("Enter Target Element :");
        int target =sc.nextInt();
        int index = -1;
        for(int i=0;i<array.length;i++){
            if(target==array[i]){
              index = i;
            }
        }
        System.out.println("The Last Occurrence of the target element in the array is :"+index);
    }
}

