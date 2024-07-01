package OOPsofJava.PolyMorphism;

public class Circle extends Shapes {
    // this will run when obj of circle is created
    // hence it is overriding the parent method
    @Override // this is called as annotation
   void area(){
       System.out.println("Area of circle is pi*r*r");
   }
}
