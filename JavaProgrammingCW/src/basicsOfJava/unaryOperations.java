package basicsOfJava;

public class unaryOperations {
    public static void main(String[] args) {
        int x=5,y=5;
        System.out.println(x++); // 5
        System.out.println(x);   // 6
        System.out.println(++y); // 6
        System.out.println(y);   // 6
        int p=x++;
        int q=++y;
        System.out.println(p); // 6
        System.out.println(x); // 7
        System.out.println(q); // 7
        System.out.println(y); // 7
    }
}
