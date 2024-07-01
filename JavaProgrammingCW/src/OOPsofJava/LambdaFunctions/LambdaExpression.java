package OOPsofJava.LambdaFunctions;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaExpression {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<5;i++){
            list.add(i+1);
        }
       list.forEach((item)-> System.out.println(item*2)); // This is called as Lambda Functions
        Consumer<Integer> fun = (item)-> System.out.println(item*2);
        list.forEach(fun);
        Student s1 = new Student(12,"Rahul");
        Student s2 = new Student(14,"Srinivas");
        Student s3 = new Student(23,"Kavita");
        ArrayList<Student> list1 = new ArrayList<>();
        list1.add(s1);
        list1.add(s2);
        list1.add(s3);
        list1.forEach((student)-> System.out.println(student.name));
    // Lambda Function it is of Consumer Type Interface with a Generic.
    // This Consumer Interface has only one method i.e. accept method it takes one parameter and has no return type
        Operation sum = (a,b)->a+b;
        Operation product = (a,b)->a*b;
        Operation sub = (a,b)->a-b;
        LambdaExpression myCalculator = new LambdaExpression();
        System.out.println(myCalculator.operate(5,3,sum));
        System.out.println(myCalculator.operate(4,3,product));
        System.out.println(myCalculator.operate(7,3,sub));
    }
    private int operate(int a,int b,Operation op){
        return op.operation(a,b);
    }
}
interface Operation{
    int operation(int a,int b);
}
class Student{
    int age;
    String name;

    public Student(int age,String name) {
        this.age = age;
        this.name=name;
    }
}