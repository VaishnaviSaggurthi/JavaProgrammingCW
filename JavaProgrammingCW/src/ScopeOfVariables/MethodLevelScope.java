package ScopeOfVariables;

public class MethodLevelScope {
    // Method
    static void sum(){
        // These Variables can be accessed only in this method but not outside this method
        int a=6;
        int b=3;
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        sum(); // Calling the method sum()
    }
}
