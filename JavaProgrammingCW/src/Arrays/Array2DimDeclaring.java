package Arrays;

public class Array2DimDeclaring {
    public static void main(String[] args) {
        int[][] ages = new int[3][3];
        ages[0][0]=1;
        ages[0][1]=3;
        ages[0][2]=4;

        ages[1][0]=5;
        ages[1][1]=6;
        ages[1][2]=9;

        ages[2][0]=7;
        ages[2][1]=3;
        ages[2][2]=8;
       for(int i=0;i<ages.length;i++){
           for(int j=0;j<ages[i].length;j++){
               System.out.println(ages[i][j]);
           }
       }

    }
}
