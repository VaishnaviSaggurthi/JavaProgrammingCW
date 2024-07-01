package ifElseStatements;

public class liesOnStraightline {
    public static void main(String[] args) {
        int x1=1,x2=2,x3=3,y1=1,y2=2,y3=4;
        int m1=(y2-y1)/(x2-x1);
        int m2=(y3-y2)/(x3-x2);
        if(m1==m2){
            System.out.println("The points lies on straight line");
        }
        else{
            System.out.println("The points does not lies on straight line");
        }
    }
}
