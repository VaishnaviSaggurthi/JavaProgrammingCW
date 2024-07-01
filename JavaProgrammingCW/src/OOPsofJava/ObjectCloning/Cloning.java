package OOPsofJava.ObjectCloning;

import java.util.Arrays;

public class Cloning {
    public static void main(String[] args) throws CloneNotSupportedException {
        CopyConstructor human1 = new CopyConstructor(34,"Virat Kohli");
        CopyConstructor human2 = new CopyConstructor(human1);
        System.out.println(human2.age+" "+human2.name);
        CopyConstructor human3 = (CopyConstructor)human1.clone();
        System.out.println(human3.age+" "+human3.name);
        CopyConstructor human4 = new CopyConstructor(human1);
        System.out.println(Arrays.toString(human4.arr));
        human4.arr[0]=1000;
        // Shallow Copy
        System.out.println(Arrays.toString(human4.arr));
        System.out.println(Arrays.toString(human1.arr));
// this is a shallow copy if changes made in one object then the other object is also getting changed because
// array is a non - primitive data type so, the two objects shares same location
// Primitive Data Types do not share same location and variables are separately created again
// Non-Primitive Data Types share same location and variables are not created separately created again in Shallow Copy
    }
}
