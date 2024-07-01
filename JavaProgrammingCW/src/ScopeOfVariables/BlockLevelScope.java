package ScopeOfVariables;

import OOPsofJava.ParameterisedConstructors;

public class BlockLevelScope {

    public static void main(String[] args) {
        int a=10;
        System.out.println("a is :"+a); // a
         // Here b is not declared and b is in block level scope
        // So, it cannot be printed outside the curly brackets
        // Block Level Code only accessed in this { } brackets
        {
            int b=5;
            System.out.println("b is :"+b); // 5
        }
        {
            int b=100;
            System.out.println("b is :"+b); // 100
            // Both b's are diiferent because there are in different blocks of code
        }
        for(int i=0;i<5;i++){
            int b =10;
            System.out.println(b);
        }
    }
}
