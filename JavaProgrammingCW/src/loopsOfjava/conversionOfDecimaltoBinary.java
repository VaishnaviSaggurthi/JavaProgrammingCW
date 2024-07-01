package loopsOfjava;

public class conversionOfDecimaltoBinary {
    public static void main(String[] args) {
        int number = 9; // 1001 --> 9
        int ans=0;
        int power=1;
        while(number>0){
            ans+=((number%2)*power);
            power*=10;
            number/=2;
        }
        System.out.println(ans);
    }
}
