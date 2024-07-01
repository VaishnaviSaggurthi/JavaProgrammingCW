package BinarySearch.Problems;

import java.util.Scanner;

public class FindSquareRoot_BinarySearch {
    static int sqrt(int x) {
        int start=0,end=x;
        int ans=-1;
        while (start <= end) {
            int mid = start + (end-start) / 2;
            int value=mid*mid;
            if (value == x) {
                return mid;
            }
            else if(value<x){
                ans=mid;
                start = mid + 1;
            }
            else{
                end=mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an element:");
        int x=sc.nextInt();
        int ans = sqrt(x);
        System.out.println("The square root of "+x+" is : "+ans); // floored value
    }
}
