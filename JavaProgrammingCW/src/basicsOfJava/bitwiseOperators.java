package basicsOfJava;

public class bitwiseOperators {
    public static void main(String[] args) {
        int x = 9; // 1001
        int y = 10; // 1010
        // BITWISE OR OPERATOR (+)
        System.out.println(x|y); // 1011 --> 11
        // BITWISE AND OPERATOR (*)
        System.out.println(x&y); // 1000 --> 8
        // BITWISE EXCLUSIVE OR OPERATOR (XOR)
        System.out.println(x^y); // 0011 --> 3
        // same bits i.e 1,1 and 0,0 --> 0 ; diff bits i.e 0,1 and 1,0 --> 1
        // BITWISE COMPLIMENT (~)
        System.out.println(~x); // 0110 --> -10
        System.out.println(~y); // 0101 --> -11
    }
}
