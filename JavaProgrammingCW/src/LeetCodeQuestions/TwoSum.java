package LeetCodeQuestions;

import java.util.Scanner;

public class TwoSum {
    public int[] twoSum(int[] nums,int target){
        int[] ans = new int[2];
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j< nums.length;j++) {
                if (nums[i]+nums[j]==target){
                    ans[0]=i;
                    ans[1]=j;
                    return ans;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array :");
        int n = sc.nextInt(); // size of an array
        int[] nums = new int[n];
        System.out.println("Enter the elements of an array :");
        for(int i=0;i<n;i++){
            nums[i]= sc.nextInt();
        }
        System.out.println("Enter the target number :");
        int target = sc.nextInt();
        TwoSum object = new TwoSum();
        int[] ans = object.twoSum(nums,target);
        for(int i=0;i<2;i++) {
            System.out.print(ans[i]+" ");
        }
    }
}
