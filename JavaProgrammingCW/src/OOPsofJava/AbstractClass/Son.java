package OOPsofJava.AbstractClass;

public class Son extends Parent{
    public Son(int age) {
        super(age);
    }

    @Override
    void normal() {
        super.normal();
    }

    @Override
    void career(){
        System.out.println("I want to become a doctor");
    }

    @Override
    void partner() {
        System.out.println("I love Wonder Woman,Her age is 28");
    }
}
