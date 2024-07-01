package OOPsofJava.AbstractClass;

public class Daughter extends Parent{
    public Daughter(int age) {
        super(age);
    }

    @Override
    void normal() {
        super.normal();
    }

    @Override
    void career(){
        System.out.println("I want to become a programmer");
    }
    @Override
    void partner() {
        System.out.println("I love Iron Man,His age is 30");
    }
}
