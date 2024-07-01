package basicsOfJava;

public class BitWiseOperators2 {
    public static void main(String[] args) {
        int a = 5;
        System.out.println(a<<1); // 10  (since it is left wise operator a<<b  --> a=a*2^b)
        System.out.println(a>>1); // 2   (since it is right wise operator a>>b --> a=a/2^b)
    }
}
