package src.com.dp.structural;

public class AdapterClient1 {
    public static void main(String[] args){
        LegPaymentProcessorP1 legPaymentProcessorP1 = new LegPaymentProcessorP1();
        PaymentProcessorAdapter1 paymentProcessorAdapter1 = new PaymentProcessorAdapter1(legPaymentProcessorP1);
        paymentProcessorAdapter1.makePayment();
    }
}
