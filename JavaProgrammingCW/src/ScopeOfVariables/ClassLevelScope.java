package ScopeOfVariables;
class Algebra{
    int a=10; // Member variables are Class Level Scope.AnyWhere it can be accessed
    int b=5;
    public int add(){
        return a+b;
    }
    public int sub(){
        return a-b;
    }
}
public class ClassLevelScope {
    public static void main(String[] args) {
        Algebra object1 = new Algebra();
        object1.add();
        Algebra object2 = new Algebra();
        object2.sub();
    }
}
