package Questions.PrefixSums;

import java.util.Scanner;

public class SumOfRangeOfIndices_1basedIndexing_Meth2 {
    static int[] rangeOfNumberSum(int[] array,int l,int r){
        int n= array.length;
        int sum=0;
        int [] prefix = new int[n];
        for(int i=1;i<array.length;i++){
            prefix[i]=prefix[i-1]+array[i];
        }
        for(int i=l;i<=r;i++){
            sum =prefix[r]-prefix[l-1];
        }
        System.out.println("The Sum of given range is :"+sum);
        return array;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array :");
        int n = sc.nextInt(); // size
        int[] array = new int[n];
        System.out.println("Enter the elements of an array :");
        // 1 Based Indexing
        for (int i = 1; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Enter no. of queries:");
        int q = sc.nextInt(); // Here q denotes no. of queries
        while (q > 0) {
            System.out.print("Enter the range of the numbers :");
            int x = sc.nextInt(); // Range of numbers
            int y = sc.nextInt(); // Range of numbers
            rangeOfNumberSum(array, x, y);
            q--;
        }
    }
}
