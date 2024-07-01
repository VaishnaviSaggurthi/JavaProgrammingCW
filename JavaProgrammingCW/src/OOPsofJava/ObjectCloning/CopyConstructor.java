package OOPsofJava.ObjectCloning;

public class CopyConstructor implements Cloneable{
    int age;
    String name;
    int[] arr = new int[]{3,4,5,6,7};
    public CopyConstructor(int age,String name) {
        this.age=age;
        this.name = name;
    }
    public CopyConstructor(CopyConstructor other){
        this.age=other.age;
        this.name=other.name;
        this.arr=other.arr;
    }
    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone(); // this is a shallow copy
//        CopyConstructor  human4 = (CopyConstructor)super.clone(); // this is also a shallow copy
//        // MAKE A DEEP COPY
//        human4.arr=new int[human4.arr.length];
//        for(int i=0;i<human4.arr.length;i++){
//            human4.arr[i]=this.arr[i];
//        }
//        return human4;
    }
}
