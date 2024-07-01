package Arrays;
import java.util.Scanner;
public class NoOfOccurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array :");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements of an array :");
        for (int i = 0; i < array.length;i++){
            array[i] = sc.nextInt();
        }
        int target = 5;
        int count = 0;
        for(int i=0;i<array.length;i++){
            if(target==array[i]){
                count++;
            }
        }
        System.out.println("The count of the target element in the array is :"+count);
    }
}