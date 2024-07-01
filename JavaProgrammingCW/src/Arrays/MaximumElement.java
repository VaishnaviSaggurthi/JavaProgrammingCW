package Arrays;

public class MaximumElement {
    public static void main(String[] args) {
        int[] array ={7,6,8,9,2,4,5};
        int maximum = array[0];
        for(int i=0;i<array.length;i++){
            if(maximum<array[i]){
                maximum=array[i];
            }
        }
        System.out.println("The Maximum Element is :"+maximum);
    }
}
