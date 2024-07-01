package OOPsofJava;

public class StudentClass {
    // creating new data type --> User Defined Data Type
    public static void main(String[] args) {
        Student x = new Student();
        x.name="Vaishnavi";
       // x.rollNo=25; --> Cannot access since it is private
        x.percentage=95.0;
        System.out.println(x.getRollNo()); // getter
        x.setRollNo(67);
        System.out.println(x.getRollNo());
        System.out.println(Student.getNoOfStudents());
        Student s1 = new Student("Raghav",76,92.1);
        System.out.println(s1.name);
        System.out.println(s1.rollNo);
        System.out.println(s1.percentage);
        System.out.println(s1.schoolName);
        System.out.println(s1.getNoOfStudents());
    }
}
