package OOPsofJava;

public class ObjectClass {
    int num;
    float gpa;
    public ObjectClass(int num,float gpa) {
        this.num=num;
        this.gpa=gpa;
    }

    @Override
    public boolean equals(Object obj) {
        return this.num == ((ObjectClass)obj).num;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
//        ObjectClass obj1 = new ObjectClass(34);
//        System.out.println(obj1.hashCode());
//        ObjectClass obj2 = obj1;
//        System.out.println(obj2.hashCode());
//        ObjectClass obj3 = new ObjectClass(34);
//        System.out.println(obj3.hashCode());
        ObjectClass obj1 = new ObjectClass(12,58.5f);
        ObjectClass obj2 = new ObjectClass(12,79.2f);
        if(obj1==obj2){
            System.out.println("obj1 is equal to obj2");
        }
        if(obj1.equals(obj2)){
            System.out.println("obj1 is equal to obj2");
        }
        System.out.println(obj1.getClass().getName());
    }
}
