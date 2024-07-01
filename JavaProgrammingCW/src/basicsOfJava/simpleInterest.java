package basicsOfJava;

public class simpleInterest {
    public static void main(String[] args) {
        double p, r, t, si;
        p = 100; // p --> principal
        r = 10;  // r --> rate
        t = 2;   // t --> time
        si = (p * r * t) / 100; // si --> Simple Interest
        System.out.println("The Simple Interest is :"+si);
    }
}
