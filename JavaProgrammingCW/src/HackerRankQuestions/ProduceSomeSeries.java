package HackerRankQuestions;

import java.util.Scanner;

public class ProduceSomeSeries {
    static int power(int x,int y){
     if(y==0) return 1;
     int power=1;
     for(int i=1;i<=y;i++){
         power*=x;
     }
     return power;
    }
    static int produceSeries(int a,int b,int n){
        if(n==0){
            return a+1*b;
        }
           return  produceSeries(a, b, n - 1) + (power(2, n) * b);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a :");
        int a = scan.nextInt();
        System.out.println("Enter b :");
        int b = scan.nextInt();
        System.out.println("Enter n :");
        int n = scan.nextInt();
        System.out.println("The sum Of the given series is :"+produceSeries(a,b,n));
    }
}
