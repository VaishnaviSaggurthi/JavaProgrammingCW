package RockPaperScissors;
import java.util.Random;
import java.util.Scanner;
import java.util.random.RandomGenerator;
public class RockPaperScissors_Random {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to play (0-->Rock,1-->Paper,2-->Scissors):");
        int user_input = sc.nextByte();
        if(user_input<=2) {
            RandomGenerator rnd = new Random();
            int computer_input = rnd.nextInt(3);
            System.out.println("Computer chose : " + computer_input);
            if (computer_input == 0) {
                System.out.println("Computer chose rock");
            } else if (computer_input == 1) {
                System.out.println("Computer chose paper");
            } else {
                System.out.println("Computer chose scissors");
            }
            if (computer_input == user_input) {
                System.out.println("Match Draw!!Play Again..");
            } else if ((user_input == 0 && computer_input == 2) || (user_input == 1 && computer_input == 0) || (user_input == 2 && computer_input == 1)) {
                System.out.println("Hurray!! You won the match..");
            } else {
                System.out.println("Computer won the match!!Try again..");
            }
        }
        else{
            System.out.println("Invalid Choice!!");
        }
    }
}
