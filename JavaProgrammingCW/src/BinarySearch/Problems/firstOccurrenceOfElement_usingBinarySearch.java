package BinarySearch.Problems;
import java.util.*;
public class firstOccurrenceOfElement_usingBinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr={2,5,5,5,6,6,8,9,9,9};
        System.out.println("Enter the target element:");
        int x=sc.nextInt();
        int start=0,end= arr.length-1;
        int index=-1;
        boolean flag=false;
            while (start <= end) {
                int mid = start + (end-start) / 2;
                if (x < arr[mid]) end = mid - 1;
                else if (x > arr[mid]) start = mid + 1;
                else if (x == arr[mid]) {
                    index = mid;
                    flag = true;
                    break;
                }
            }
        System.out.println("The first occurrence of target is :"+index);
   }
}

