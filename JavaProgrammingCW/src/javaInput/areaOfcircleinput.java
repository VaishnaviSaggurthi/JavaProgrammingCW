package javaInput;
import java.util.Scanner;
public class areaOfcircleinput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius :");
        int radius;
        radius=sc.nextInt();
        double pi = 3.1415;
        double area=pi*radius*radius;
        System.out.println("The Area of circle is :"+area);
    }
}
