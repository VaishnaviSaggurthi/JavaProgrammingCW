package OOPsofJava.Inheritence;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box(3.4, 5.6, 5);
        System.out.println(box1.l+" "+box1.h+" "+box1.w);
        BoxWeight box = new BoxWeight(3.6,8.0,7,34);
        System.out.println(box.l+" "+box.h+" "+box.w+" "+box.weight);
        Box box2 = new BoxWeight(2,3,4,8);
        System.out.println(box2.w); // box2.weight cannot be accessed only the attributes in ref type can be accessed
        // BoxWeight box3 = new Box(2,4,3); // gives an error here weight can be accessed i.e. in ref type but the object
        // is of Box class i.e. it has no access so, it gives an error
        Box.greeting();
        Box box4 = new BoxWeight();
        Box.greeting();
        BoxWeight box5 = new BoxWeight();
        BoxWeight.greeting(); // you can inherit but you cannot override static methods
        System.out.println(box1 instanceof Object);
        System.out.println(box2 instanceof BoxPrice);
        System.out.println(box4 instanceof BoxWeight);
    }
}
/*
. If any of the attribute in parent class is "private" then it cannot be accessed in child class
. The properties/attributes present in child class cannot be accessed by parent class
. The parent class properties/attributes can be accessed by child class by inheriting that is by the
  keyword "extends"
. private variables/attributes cannot be accessed in another class it can be accessed in same class
  that is if the attribute in parent class is private then it can be accessed only in that class it
  is not accessed in child class and main class
 */
