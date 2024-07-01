package ifElseStatements;
import java.util.Scanner;
public class areaAndperimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length :");
        int length = sc.nextInt(); // Taking Length as input
        System.out.println("Enter Breadth :"); // Taking Breadth as input
        int breadth = sc.nextInt();
        int area = length * breadth; // Formula for Area of Rectangle
        int perimeter = 2*(length+breadth); // Formula for Perimeter of Rectangle
        System.out.println("The Area is :"+area);
        System.out.println("The perimeter is :"+perimeter);
        if(area>perimeter){
            System.out.println("The Area is greater than Perimeter");
        }
        else if(perimeter>area){
            System.out.println("The Area is not greater than Perimeter");
        }
        else{
            System.out.println("Both Area and Perimeter are equal");
        }
    }
}
