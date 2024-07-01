package Recursion.Problems;
import java.util.Scanner;
public class TargetElementToFindInArray {
    static boolean targetElement(int[] arr,int x,int index){
        int n = arr.length;
        // Base Case
      if(index>=n) {
          return false;
      }
      // Self Work
      if(arr[index]==x){
          return true;
      }
      // Recursive Work
        return targetElement(arr,x,index+1);
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
        if(targetElement(arr,x,index)){ // true
            System.out.println("Yes");
        }
        else{ // false
            System.out.println("No");
        }

    }
}
