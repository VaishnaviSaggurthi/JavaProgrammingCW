package OOPsofJava;

public class FractionClass {
    public static Fraction add(Fraction f1,Fraction f2){
        int numerator = f1.num*f2.den + f1.den*f2.num;
        int denominator = f1.den*f2.den;
        Fraction f3 = new Fraction(numerator,denominator);
        return f3;
    }
    public static Fraction subtract(Fraction f1,Fraction f2){
        int numerator = f1.num*f2.den - f1.den*f2.num;
        int denominator = f1.den*f2.den;
        Fraction f4 = new Fraction(numerator,denominator);
        return f4;
    }
    public static Fraction multiply(Fraction f1,Fraction f2){
        int numerator = f1.num*f2.num;
        int denominator = f1.den*f2.den;
        Fraction f5 = new Fraction(numerator,denominator);
        return f5;
    }
    public static Fraction division(Fraction f1,Fraction f2){
        int numerator = f1.num*f2.den;
        int denominator = f1.den*f2.num;
        Fraction f6 = new Fraction(numerator,denominator);
        return f6;
    }
    public static class Fraction{
        int num;
        int den;
        public static int gcd(int num,int den){
            if(den==0) return num;
            return gcd(den,num%den);
        }
        public void simplify() {
            int hcf = gcd(num, den);
            num /= hcf;
            den /= hcf;
        }
        public Fraction(int num,int den) {
            this.num = num;
            this.den = den;
            simplify();
        }
    }
    public static void main(String[] args) {
        Fraction f1 = new Fraction(35,21);
        System.out.println("The Fraction f1 is :"+" "+f1.num+"/"+f1.den);
        Fraction f2 = new Fraction(7,3);
        System.out.println("The Fraction f2 is :"+" "+f2.num+"/"+f2.den);
        Fraction f3 = add(f1,f2);
        System.out.println("The Sum of f1 and f2 is :"+" "+f3.num+"/"+f3.den);
        Fraction f4 = subtract(f1,f2);
        System.out.println("The Subtraction of f1 and f2 is :"+" "+f4.num+"/"+f4.den);
        Fraction f5 = multiply(f1,f2);
        System.out.println("The Product of f1 and f2 is :"+" "+f5.num+"/"+f5.den);
        Fraction f6 = division(f1,f2);
        System.out.println("The Division of f1 and f2 is :"+" "+f6.num+"/"+f6.den);
    }
}
