package LeetCodeQuestions;
import java.util.Scanner;
public class ReverseIntegerHasLimits {
    public int reverse(int x) {
        long r=0;
        while(x!=0){
            r=r*10;
            r=r+(x%10);
            x=x/10;
        }
        if(r>Integer.MAX_VALUE || r<Integer.MIN_VALUE){
            return 0;
        }
        if(x<0){
            return (int)(-1*r);
        }
        return (int)r;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number n :");
        int n = sc.nextInt();
         ReverseIntegerHasLimits obj = new ReverseIntegerHasLimits();
        System.out.println("The Reversed number is :"+obj.reverse(n));
    }
}
