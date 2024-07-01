package OOPsofJava;

public class Student {
    String name;
    int rollNo;
    double percentage;
    final String schoolName = "DPS";
    private static int noOfStudents;
    public Student(String name,int rollNo,double percentage){
        this.name=name;
        this.rollNo=rollNo;
        this.percentage=percentage;
        noOfStudents++;
    }

    public Student() {

    }

    public static int getNoOfStudents() {
        return noOfStudents;
    }

    public int getRollNo(){ // getter
        return rollNo;
    }
    public void setRollNo(int rollNo) { // setter
        this.rollNo = rollNo;
    }
}
