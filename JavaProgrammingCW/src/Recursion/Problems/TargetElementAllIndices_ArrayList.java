package Recursion.Problems;

import java.util.*;

public class TargetElementAllIndices_ArrayList {
    static ArrayList<Integer> targetElement(int[] arr,int x,int index){
        int n = arr.length;
      if(index>=n){
        return new ArrayList<>(); // return empty arraylist
      }
      ArrayList<Integer> ans = new ArrayList<>();
      // arr--> 4,4,2,4
      if(arr[index]==x){  // ans -->{0}
        ans.add(index);
      }
        ArrayList<Integer> smallAns = targetElement(arr,x,index+1); // smallAns --> {1,3}
      ans.addAll(smallAns); // {0,1,3}
      return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of an array : ");
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter the target element :");
        int x= sc.nextInt();
        int index=0;
        System.out.println("The Index of target element in the array is :");
        ArrayList<Integer> ans = targetElement(arr,x,index);
        for (Integer i: ans) {
            System.out.print(i+" ");
        }
    }
}
