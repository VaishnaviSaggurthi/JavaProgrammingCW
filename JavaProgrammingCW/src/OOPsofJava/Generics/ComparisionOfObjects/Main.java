package OOPsofJava.Generics.ComparisionOfObjects;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(12,76.58f);
        Student s2 = new Student(34,76.58f);
        Student a = new Student(67,86.58f);
        Student b = new Student(45,66.58f);
        Student c = new Student(32,96.58f);
        Student[] list = {a,b,c};
        System.out.println(Arrays.toString(list));
        Arrays.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return (int)(o1.marks-o2.marks);
            }
        });
        System.out.println(Arrays.toString(list));
//        Arrays.sort(list,(o1,o2)-> (int) (o1.marks-o2.marks));
//        System.out.println(Arrays.toString(list));
// These are called as Lambda Functions instead of the above method with Comparator Generic
        if(s1.compareTo(s2)==0){
            System.out.println(s1.compareTo(s2));
            System.out.println("Student 1 and Student 2 has same marks");
        }
        else if(s1.compareTo(s2)<0){
            System.out.println(s1.compareTo(s2));
            System.out.println("Student 2 has more marks than student 1");
        }
    }
}
