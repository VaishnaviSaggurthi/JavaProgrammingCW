package LeetCodeQuestions;

import java.util.Scanner;

public class ContainsDuplicates {
    public boolean containsNearByDuplicates(int[] nums ,int k) {
        int n= nums.length;
       for(int i=0;i<n;i++){
           for(int j=i+1;j<n;j++) {
               if (nums[i] == nums[j] && Math.abs(i - j) <= k) {
                   return true;
               }
           }
       }
           return false;
    }
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array :");
        int n = sc.nextInt(); // size of array
        int[] nums = new int[n];
        System.out.println("Enter the elements of an array :");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println("Enter an integer:");
        int k=sc.nextInt();
        ContainsDuplicates object = new ContainsDuplicates();
        System.out.println(object.containsNearByDuplicates(nums,k));
    }
}
