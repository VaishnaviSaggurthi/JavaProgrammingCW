package Arrays;

public class TargetElement {
    public static void main(String[] args) {
        int[] array = {1,5,4,6,7,6,8,9};
        int target = 6;
        int ans=-1;
        for(int i=0;i<array.length;i++) {
            if (array[i]==target){
                ans=i;
                break;
            }
        }
        System.out.println("The target number "+target+" is found at the index : "+ans);
    }
}
