package ifElseStatements;
import java.util.Scanner;
public class CostSellingPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter cost price :");    // cp --> cost price
        int cp = sc.nextInt();
        System.out.println("Enter selling price :"); // sp --> selling price
        int sp = sc.nextInt();
        if(cp>sp){
            System.out.println("The Seller has made loss");
        }
        if(sp>cp){
            System.out.println("The Seller has made profit");
        }
        else{
            System.out.println("No Profit,No Loss");
        }
    }
}
