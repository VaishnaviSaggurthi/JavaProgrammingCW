package OOPsofJava.AbstractClass;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(34);
        son.career();
        son.partner();
        son.normal();
        Daughter daughter = new Daughter(22);
        daughter.career();
        daughter.partner();
        daughter.normal();
        Parent p = new Daughter(22); // dynamic method dispatch
        p.career();
        Parent.hello();
        // we cannot create Parent class object directly for abstract classes,we can create as below code
     /*
      Parent p1 = new Parent() {
            @Override
            void career() {

            }

            @Override
            void partner() {

            }
        };
      */
    }
}
