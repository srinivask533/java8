package src.com.dp.structural;

public class PaymentProcessorAdapter1  implements PaymentProcessor1{
    private LegPaymentProcessorP1 legPaymentProcessorP1;
    PaymentProcessorAdapter1(LegPaymentProcessorP1 legPaymentProcessorP1){
        this.legPaymentProcessorP1 = legPaymentProcessorP1;
    }

    @Override
    public void makePayment() {
        legPaymentProcessorP1.pay();
    }
}
