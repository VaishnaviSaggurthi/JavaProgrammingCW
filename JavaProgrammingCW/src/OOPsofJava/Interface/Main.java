package OOPsofJava.Interface;

public class Main {
    public static void main(String[] args) {
      Car car1 = new Car();
      car1.brake();
      car1.acc();
      car1.start();
      car1.stop();
      Brake car2 = new Car();
      car2.brake();
      Media carMedia = new Car();
      carMedia.start();
      // this is a problem so, to prevent from this problem we have to create separate classes for separate interfaces
      NiceCar car = new NiceCar();
      // In NiceCar the ref type is Engine and obj type is PowerEngine and later we can update it to ElectricalEngine
      car.start();
      car.startMusic();
      car.stop();
      car.upgradeEngine();
      car.start();
      car.stopMusic();
      car.stop();
    }
}
