package basicsOfJava;

public class assignmentOperations {
    public static void main(String[] args) {
        // ASSIGNMENT OPERATORS ARE =,+=,-=,/=,%= etc.
        // = operator
        int x = 5;
        System.out.println(x); // x=5
        // += operator
        int y = 7;
        x += y;
        System.out.println(x); // x=x+y --> x=5+7=12
        // -= operator
        x -= y;
        System.out.println(x); // x=x-y --> x=12-7=5
        // *= operator
        x *= y;
        System.out.println(x); // x=x*y --> x=5*7=35
        // /= operator
        x /= y;
        System.out.println(x); // x=x/y --> x=35/7=5
        // %= operator
        x %= y;
        System.out.println(x); // x=x%y --> x=5%7=5
    }
}




