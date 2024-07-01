package Strings;

public class printAllSubstrings {
    public static void main(String[] args) {
        String str="abcde";
        for(int i=0;i<=4;i++){
            for(int j=i+1;j<=5;j++){
                System.out.println(str.substring(i,j)+" ");
            }
        }
    }
}
