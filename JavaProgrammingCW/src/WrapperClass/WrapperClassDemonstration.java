package WrapperClass;

public class WrapperClassDemonstration {
    public static void main(String[] args) {
        Integer i = Integer.valueOf(4); // Wrapper Class --> Integer , i --> object
        System.out.println(i);
        Float f = Float.valueOf(3.14f);
        System.out.println(f);
        // Why should we use wrapper class ?
 /*   1. java.util package works only on objects but not on PDT(Primitive Data Types) so, we will use Wrapper Class
         that is which wraps PDT in objects so, PDTs can be accessed in that package
      2. Collection FrameWorks like Array Lists are also works on objects but not on PDT so , we will use Wrapper Class
      3. If we write int i=4 it is violating OOP language which contains objects and classes so, we will use Wrapper Class
 */
    }

}
