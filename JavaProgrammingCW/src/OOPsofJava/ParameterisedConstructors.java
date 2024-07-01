package OOPsofJava;

public class ParameterisedConstructors {
    int x; // Global Variables
    int y;
    // Constructor
    ParameterisedConstructors(int x,int y) {
        this.x=x;
        this.y=y;
        // Here Class_Name is Constructors and Constructor_Name is also Constructors
    }
    // Methods
     int sum(){
        return x+y;
    }
    int sub(){
        return x-y;
    }
    int mul(){
        return x*y;
    }
    // Main Method
    public static void main(String[] args) {
        // Constructors_Name = Class_Name
        ParameterisedConstructors object = new ParameterisedConstructors(5,7);
        // Calling Constructors() while creating an object

        System.out.println(object.sum());
        System.out.println(object.sub());
        System.out.println(object.mul());

    }
}
