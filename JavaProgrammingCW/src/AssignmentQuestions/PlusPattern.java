package AssignmentQuestions;

import java.util.Scanner;

public class PlusPattern {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the no. of rows and columns :");
        int n = sc.nextInt(); // size
        // Pattern is possible only for odd numbers so, enter odd numbers(size)
        int ml=n/2;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(ml==i || ml==j){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
