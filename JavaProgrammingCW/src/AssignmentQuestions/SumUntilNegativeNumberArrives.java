package AssignmentQuestions;

import java.util.Scanner;

public class SumUntilNegativeNumberArrives {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of numbers to be entered by user :");
        int n= sc.nextInt();
        int sum=0;
        System.out.println("Enter the numbers you want :");
        for(int i=1;i<=n;i++){
            int x = sc.nextInt();
            if(x>=0){
                sum+=x;
            }
            else{
                sum =-1;
                break;
            }
        }
        System.out.print(sum);
    }
}
