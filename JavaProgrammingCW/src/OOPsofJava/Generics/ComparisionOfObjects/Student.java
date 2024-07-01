package OOPsofJava.Generics.ComparisionOfObjects;

public class Student implements Comparable<Student> {
    int rno;
    float marks;

    public Student(int rno, float marks) {
        this.rno = rno;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return marks + " ";
    }

    @Override
    public int compareTo(Student o) {
        int diffMarks = (int) (this.marks - o.marks);
        // int diffRno = this.rno-o.rno;
//        int returnValue=0;
//        // if diffMarks==0 both are equal
//        // if diffMarks<0 then o is bigger else o is smaller
//        if(diffMarks==0 && diffRno == 0){
//            returnValue=0;
//        }
//        else if(diffMarks==0){
//            returnValue=1;
//        }
//        else if(diffMarks<0){
//            returnValue=2;
//        }
//        else if(diffMarks>0){
//            returnValue=3;
//        }
//        else if(diffRno==0){
//            returnValue=4;
//        }
//        else if(diffRno<0){
//            returnValue=5;
//        }
//        else if(diffRno>0){
//            returnValue=6;
//        }
//        else{
//            returnValue=-1;
//        }
//        return returnValue;
//    }
        return diffMarks;
    }
}
