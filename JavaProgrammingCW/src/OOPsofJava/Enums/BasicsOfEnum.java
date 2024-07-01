package OOPsofJava.Enums;

import OOPsofJava.Interface.Brake;

public class BasicsOfEnum {
    enum Week  {
        // implements Brake // we can implement interfaces to enum
        Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday;
        // these are enum constants
        // public static and final
        // since it is final you can not create child enums
        // type is Week

        Week() {
            System.out.println("Constructor is called:"+this);
        }
        // this is not public or protected,only private or default
        // why ? because we don't want to create new objects
        // this is not the enum concept,that's why
        // internally : public static final Week Monday = new Week();

//        @Override
//        public void brake() {
//            System.out.println("Hello");
//        }
    }

    public static void main(String[] args) {
        Week week;
        week=Week.Monday;
       // week.brake();
        for(Week day : Week.values()){
            System.out.println(day);
        }
        System.out.println(week.valueOf("Monday")); // returns the value of enum constants
        System.out.println(week.ordinal()); // index or order of enum constants
    }
}
