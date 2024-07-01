package HackerRankQuestions;

import java.util.Scanner;

public class AppleAndOrangeQuestion {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int s=sc.nextInt(); // start point
        int t=sc.nextInt(); //end point
        int a=sc.nextInt(); // location of apple tree
        int b=sc.nextInt(); // location of orange tree
        int apples=sc.nextInt();  // no.of apples
        int oranges=sc.nextInt(); // no. of oranges
        int[] arr = new int[apples]; // integer array, distances at which each apple falls from the tree
        int[] brr = new int[oranges]; // integer array, distances at which each orange falls from the tree
        for(int  i=0;i<apples;i++){
            arr[i]=sc.nextInt();
        }
        for(int  i=0;i<oranges;i++){
            brr[i]=sc.nextInt();
        }
        for(int  i=0;i<apples;i++){
            arr[i]+=a;
        }
        for(int  i=0;i<oranges;i++) {
            brr[i] +=b;
        }
        int count1=0;
        int count2=0;
        for(int i=0;i<apples;i++){
            if( arr[i]>=s && arr[i]<=t){
                count1++;
            }
        }
        for(int i=0;i<oranges;i++){
            if( brr[i]>=s && brr[i]<=t){
                count2++;
            }
        }
        System.out.println("The count of apples fall down: "+count1);
        System.out.println("The count of oranges fall down: "+count2);
    }
}
