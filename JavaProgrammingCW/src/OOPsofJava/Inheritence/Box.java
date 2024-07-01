package OOPsofJava.Inheritence;
// parent class or super class or base class
public class Box {
    double l;
    double h;
    double w;
    Box(){
        this.l=-1;
        this.h=-1;
        this.w=-1;
    }
    // cube
    Box(double side){
        this.l=side;
        this.h=side;
        this.w=side;
    }
    static void greeting(){
        System.out.println("Hey,I am in Box Class");
    }
    Box(double l,double h,double w){
        this.l=l;
        this.h=h;
        this.w=w;
    }
    Box(Box box){
        this.l=box.l;
        this.h=box.h;
        this.w=box.w;
    }
    public void information(){
        System.out.println("I am in a Box class");
    }
}
