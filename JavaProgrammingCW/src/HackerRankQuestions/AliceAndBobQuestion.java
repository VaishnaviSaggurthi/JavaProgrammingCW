package HackerRankQuestions;

import java.util.Scanner;

public class AliceAndBobQuestion {
    static int[] points(int[] a,int[] b,int n){
        int[] ans = new int[2]; // length is 2 bcz points of alice and bob
        for(int i=0;i<n;i++){
            if(a[i]>b[i]){
                ans[0]++;
            }
            else if(a[i]!=b[i]){
                ans[1]++;
            }
        }
        return ans;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length :");
        int n=sc.nextInt(); // length
        int[] a = new int[n];
        System.out.println("Enter the marks of Alice:");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int[] b = new int[n];
        System.out.println("Enter the marks of Bob :");
        for(int i=0;i<n;i++){
            b[i]=sc.nextInt();
        }
        int[]  ans = points(a, b, n);
        System.out.println("The Points for Alice and Bob is :");
        for(int i=0;i<2;i++) {
            System.out.print(ans[i]+" ");
        }
    }
}
