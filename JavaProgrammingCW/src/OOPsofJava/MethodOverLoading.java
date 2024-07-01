package OOPsofJava;
class Calculator{
    public int add(int n1,int n2){
        return n1+n2;
    }
    public int add(int n1,int n2,int n3){
        return n1+n2+n3;
    }
    public double add(double n1,int n2){
        return n1+n2;
    }
    // Same Method Name With Different Parameters Or Different DataTypes Is Called As Method OverLoading
}
public class MethodOverLoading {
    public static void main(String[] args) {
        Calculator obj = new Calculator();
        System.out.println(obj.add(3,4));
        System.out.println(obj.add(1,2,3));
        System.out.println(obj.add(4.5,6));
    }
}
