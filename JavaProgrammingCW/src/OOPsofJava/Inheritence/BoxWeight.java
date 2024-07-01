package OOPsofJava.Inheritence;
// child class or subclass or derived class
public class BoxWeight extends Box{
      double weight;
      public BoxWeight(){
          this.weight=-1;
      }
      BoxWeight(BoxWeight other) {
          // it is same as Box box1 = new BoxWeight(2,3,4,6);
          // only variables in ref type can be accessed here weight can not be accessed
          super(other);
          this.weight = other.weight;
      }
//      @Override
//      static void greeting(){
//          System.out.println("Hey,I am in BoxWeight Class");
//      }
    BoxWeight(double side,double weight){
        super(side); // what is this ? call the parent class constructor
        // used to initialize values present in parent class
        this.weight=weight;
    }
      BoxWeight(double l,double h,double w,double weight){
          super(l, h, w); // what is this ? call the parent class constructor
          // used to initialize values present in parent class
          this.weight=weight;
      }
}
