package OOPsofJava.CustomArrayList;

import java.util.*;

public class CustomArrayLists {
    private int[] data;
    private static int DEFAULT_SIZE=10;
    private int size=0; // initial size is declared as 0 it also acts as index value
    public CustomArrayLists() {
        this.data = new int[DEFAULT_SIZE];
    }
    public void add(int num){
        if(isFull()){
            resize();
        }
        data[size++]=num;
    }
    public boolean isFull(){
        return size==data.length;
    }
    public void resize(){
        int[] temp = new int[data.length*2];
        // copy the current items in new array
        for(int i=0;i< data.length;i++){
            temp[i]=data[i];
        }
        data=temp;
    }
    public int remove(){
        int removed = data[--size];
        return removed;
    }
    public int get(int index){
        return data[index];
    }
    public int size(){
        return size;
    }
    public void set(int index, int value){
        data[index]=value;
    }

    @Override
    public String toString() {
        return "CustomArrayLists{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }
    public static void main(String[] args) {
       CustomArrayLists list = new CustomArrayLists();
//        list.add(5);
//        list.add(6);
//        list.add(7);
       for(int i=0;i<14;i++){
           list.add(2*i);
       }
        System.out.println(list);
        System.out.println(list.get(3));
    }
}
