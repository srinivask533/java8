package src.com.cognos;

class A implements Add,Substract {

    @Override
    public int add(int a, int b) {
        return 0;
    }
}

public class FunctionIntefr {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.add(10, 20));
    }
}
