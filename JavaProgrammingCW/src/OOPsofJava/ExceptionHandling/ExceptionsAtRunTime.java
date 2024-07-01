package OOPsofJava.ExceptionHandling;

import java.util.Scanner;

public class ExceptionsAtRunTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        b= sc.nextInt();
        try{
            String name="Srinivas";
            if(name=="Srinivas"){
                throw new CustomException("Name is Srinivas");
            }
            int d=divide(a,b);
            System.out.println("The division of a and b is:"+d);
        }
        catch(CustomException e){
            System.out.println(e.getMessage());
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        catch(Exception e){
            System.out.println("Normal Exception");
        }
        finally{
            System.out.println("This will always gets executed");
        }
    }
    static int divide(int a,int b) throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException("Please do not divide with zero");
        }
        return a/b;
    }
}
