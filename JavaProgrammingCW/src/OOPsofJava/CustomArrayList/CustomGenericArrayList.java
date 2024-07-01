package OOPsofJava.CustomArrayList;

import java.util.Arrays;

public class CustomGenericArrayList<T> {
    private Object[] data;
    private static int DEFAULT_SIZE=10;
    private int size=0; // initial size is declared as 0 it also acts as index value
    public CustomGenericArrayList() {

        this.data = new Object[DEFAULT_SIZE];
    }
    public void add(T num){
        if(isFull()){
            resize();
        }
        data[size++]=num;
    }
    public boolean isFull(){
        return size==data.length;
    }
    public void resize(){
        Object[] temp = new Object[data.length*2];
        // copy the current items in new array
        for(int i=0;i< data.length;i++){
            temp[i]=data[i];
        }
        data=temp;
    }
    public T remove(){
        T removed = (T)(data[--size]); // Type casting of data array to T type
        return removed;
    }
    public T get(int index){
        return (T)(data[index]);
    }
    public int size(){
        return size;
    }
    public void set(int index, int value){
        data[index]=value;
    }

    @Override
    public String toString() {
        return "CustomGenericArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }
    public static void main(String[] args) {
       CustomGenericArrayList<Integer> list = new CustomGenericArrayList<>();
       for(int i=0;i<14;i++){
           list.add(2*i);
       }
        System.out.println(list);
        CustomGenericArrayList<String> list1 = new CustomGenericArrayList<>();
        list1.add("Vaishnavi");
        list1.add("Likhitha");
        list1.add("Srinivasa Rao");
        System.out.println(list1);
        System.out.println(list1.get(2));
    }
}
