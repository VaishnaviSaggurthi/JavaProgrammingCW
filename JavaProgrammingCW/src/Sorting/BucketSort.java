package Sorting;
import java.util.ArrayList;
import java.util.Collections;
public class BucketSort {
    static void bucketSort(float[] array){
        int n = array.length;
        // create buckets
        ArrayList<Float>[] buckets = new ArrayList[n];
        // creating empty buckets
        for(int i=0;i<n;i++){
            buckets[i]=new ArrayList<Float>();
        }
        // add elements into our buckets
        for(int i=0;i<n;i++){
           int bucketIndex = (int)array[i]*n;
           buckets[bucketIndex].add(array[i]);
        }
        // sort each bucket individually
        for(int i=0;i< buckets.length;i++) {
            Collections.sort(buckets[i]);
        }
        // merge all buckets to get final sorted array
        int index=0;
        for(int i=0;i< buckets.length;i++){
            ArrayList<Float> currBucket = buckets[i];
            for(int j=0;j< currBucket.size();j++){
                array[index++]=currBucket.get(j);
            }
        }
    }
    public static void main(String[] args) {
        float[] array = {0.5f,0.4f,0.3f,0.2f,0.1f};
            bucketSort(array);
            for(float val : array){
                System.out.print(val+" ");
            }
    }
}
