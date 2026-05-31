package src.com.cognos;
@FunctionalInterface
public  interface PaymentService{
    void pay(double amount);
    default void getPaymentDetails(){
        System.out.println();
    }
}
