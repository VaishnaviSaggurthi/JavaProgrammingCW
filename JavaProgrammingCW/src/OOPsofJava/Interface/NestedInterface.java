package OOPsofJava.Interface;

public class NestedInterface {
    public interface NestedInterfaces{
        boolean isOdd(int num);
    }
}
class B implements NestedInterface.NestedInterfaces{
    @Override
    public boolean isOdd(int num) {
        return (num&1)==1;
    }
}
