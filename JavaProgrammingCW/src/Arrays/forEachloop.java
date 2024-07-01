package Arrays;

public class forEachloop {
    public static void main(String[] args) {
        int[] ages = new int[3];
        ages[0] = 9;
        ages[1] = 8;
        ages[2] = 3;
        for(int age : ages){
            System.out.println(age);
        }
    }
}
