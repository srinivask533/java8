package src.com.dp.structural;

public class AdapterClient {
    public static void main(String[] args){
        LegacyPaymentProcessor legacyPaymentProcessor = new
                LegacyPaymentProcessor();

        PaymentProcessorAdapter paymentProcessorAdapter = new PaymentProcessorAdapter(legacyPaymentProcessor);
        paymentProcessorAdapter.pay(10d);


    }
}
