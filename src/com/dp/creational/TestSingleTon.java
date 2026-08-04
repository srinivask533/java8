package src.com.dp.creational;

public class TestSingleTon {

    public static void main(String[] args){
       String message = SingleTon.SINGLE_TON.getName();
       System.out.println(message);
    }
}
