package OOPsofJava.Interface;

public class Car implements Brake,Engine,Media{
    @Override
    public void brake() {
        System.out.println("I brake as a normal car");
    }

    @Override
    public void start() {
        System.out.println("I start engine as a normal car");
    }

    @Override
    public void stop() {
        System.out.println("I stop engine as a normal car");
    }

    @Override
    public void acc() {
        System.out.println("I accelerate as a normal car");
    }
}
