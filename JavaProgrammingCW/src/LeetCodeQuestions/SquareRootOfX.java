package LeetCodeQuestions;
import java.util.Scanner;
public class SquareRootOfX {
        public int mySqrt(int x) {
            int y = (int)Math.sqrt(x);
            return y;
        }
        public static void main(String[] args){
            Scanner sc = new Scanner (System.in);
            System.out.println("Enter the value of n :");
            int n = sc.nextInt();
            SquareRootOfX obj = new SquareRootOfX();
            System.out.println("The square of "+n+" is :"+ obj.mySqrt(n));
        }
}
