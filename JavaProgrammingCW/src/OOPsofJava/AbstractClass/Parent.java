package OOPsofJava.AbstractClass;

public abstract class Parent {
    int age;
    public Parent(int age) {
        this.age = age;
    }
    // we cannot create abstract constructors of abstract classes
    // abstract Parent(){ } is not possible
    /* we cannot create abstract static methods because static means
     it should not override but abstract means it should definitely
     override so, we cannot create abstract static methods
     */
    // But, we can create static methods in abstract classes
    static void hello(){
        System.out.println("Hello,Greetings!!");
    }
    void normal(){
        System.out.println("This is normal method");
    }
    abstract void career();
    abstract void partner();
}
