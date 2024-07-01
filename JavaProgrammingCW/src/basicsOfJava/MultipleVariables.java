package basicsOfJava;

public class MultipleVariables {
    public static void main(String[] args) {
        int x=2,y=5,z=3;
        System.out.println("The Value of x is :"+x);
        //System.out.println(x);
        System.out.println("The Value of y is :"+y);
        //System.out.println(y);
        System.out.println("The Value of z is :"+z);
        //System.out.println(z);
        System.out.println(x+y+z);
        System.out.println("The three values are :"+x+y+z);
        System.out.println("The sum of three variables is :"+(x+y+z));
        System.out.println(""+x+y+z);
        System.out.println(+x+""+y+z);
        System.out.println(+x+y+""+z);
        System.out.println(+x+y+z+"");
        System.out.println(+x+""+(y+z));
    }
}
