package OOPsofJava;
public class PersonClassObject {
   public  int age=17; // Attribute
   public String name="Vaishnavi";
   public static int dateOfBirth=2006;
    public static void main(String[] args) {
        // Creating an Object --> ClassName ObjectName = new Classname();
        PersonClassObject person =  new PersonClassObject();
        // Accessing attributes/methods --> ObjectName.attribute/methods
        System.out.println(person.age);
        System.out.println(person.name);
        System.out.println(dateOfBirth);
    }
}
