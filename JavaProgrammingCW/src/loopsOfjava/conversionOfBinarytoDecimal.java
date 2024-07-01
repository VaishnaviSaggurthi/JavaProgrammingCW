package loopsOfjava;
public class conversionOfBinarytoDecimal {
    public static void main(String[] args) {
        int number=1001;// 1001 --> 9
        int ans=0;
        int power=1;
        while(number!=0){
            ans=ans+((number%10)*power);
            power*=2;
            number/=10;
        }
        System.out.println(ans);
    }
}
