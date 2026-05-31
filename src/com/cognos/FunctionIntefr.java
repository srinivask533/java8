package src.com.cognos;

 class A implements Add,Substract, PaymentService {

    @Override
    public int add(int a, int b) {
        return 0;
    }


    @Override
    public void pay(double amount) {

    }

    @Override
    public int substract(int a, int b) {
        return 0;
    }
}

class B extends A {

}

public class FunctionIntefr {
    public static void main(String[] args) {
        Add a = new A();
        System.out.println(a.add(10, 20));
    }
}
