package ifElseStatements;
import java.util.Scanner;
public class percentage {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        System.out.println("Enter a percentage :");
        int percentage = sc.nextInt();
        if(percentage>=90){
            System.out.println("Excellent");
        }
        else if(percentage>=80){
            System.out.println("Very Good");
        }
        else if(percentage>=60){
            System.out.println("Good");
        }
        else if(percentage>=40){
            System.out.println("Average");
        }
        else if(percentage>=35){
            System.out.println("Below Average");
        }
        else{
            System.out.println("Fail");
        }
    }
}
