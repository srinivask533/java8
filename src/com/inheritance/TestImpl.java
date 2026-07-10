package src.com.inheritance;

public class TestImpl implements Test,Test2 {
    @Override
    public void sayHello() {
        System.out.print("Printed");
    }

    public static void main(String[] args){
        Test t = new TestImpl();
        t.sayHello();
    }
}
