package src.com.dp.structural;

public class PaymentProcessorAdapter  implements PaymentProcessor{

    private LegacyPaymentProcessor legacyPaymentProcessor;
    PaymentProcessorAdapter(LegacyPaymentProcessor legacyPaymentProcessor){
        this.legacyPaymentProcessor = legacyPaymentProcessor;
    }
    @Override
    public void pay(Double d) {
        legacyPaymentProcessor.makePayment(d);
    }
}
