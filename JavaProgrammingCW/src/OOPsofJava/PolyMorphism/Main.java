package OOPsofJava.PolyMorphism;

public class Main {
    public static void main(String[] args) {
        // concept of method over ridding polymorphism also known as run time polymorphism
        Shapes shape = new Shapes();
        shape.area();
        Square square = new Square();
        square.area(); // overrides the area() method  in Shapes class
        Circle circle = new Circle();
        circle.area(); // overrides the area() method  in Shapes class
        Triangle triangle = new Triangle();
        triangle.area(); // overrides the area() method  in Shapes class
        Shapes obj = new Square();
        obj.area();
    }
}
