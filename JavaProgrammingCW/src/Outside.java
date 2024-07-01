import OOPsofJava.*;

public class Outside {
    public static void main(String[] args) {
        AccessModifiers object  = new AccessModifiers();
        System.out.println("Outside Package,Non-Child Class :"+object.string1);
        AccessModifiers3 object3 = new AccessModifiers3();
        object3.printFromChildClass();
    }
}
// Here Child Class is AccessModifiers3 and Parent Class is AccessModifiers
class AccessModifiers3 extends AccessModifiers{
     void printFromChildClass(){
         AccessModifiers3 object3 = new AccessModifiers3();
        System.out.println("Child Class :"+object3.string1);
    }
}