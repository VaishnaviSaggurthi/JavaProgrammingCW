package OOPsofJava;

public class AccessModifiers {
   public String string1 = "I am a public member"; // Attributes (OR) Member Variables (OR) Properties
   public void printFromClass(){ // Method
       System.out.println("Within Class :"+string1);
   }
    public static void main(String[] args) { // Main Method
        AccessModifiers object  = new AccessModifiers(); // Creating Object
        object.printFromClass(); // Calling the method printFromClass
        System.out.println("Within Class :"+object.string1);
        AccessModifiers2 object2 = new AccessModifiers2();
        object2.printFromOutsideClass(); // Calling the method printFromOutsideClass
    }
}
class AccessModifiers2{
    AccessModifiers object = new AccessModifiers();
  public void printFromOutsideClass(){
      System.out.println("Within Package,Outside Class :"+object.string1);
  }

}
