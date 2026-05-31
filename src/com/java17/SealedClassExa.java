package src.com.java17;

sealed  interface PaymentSerivce permits CreditCardPayment, DebitCardPayment{
    void pay(double amount);
}

 sealed interface DebitCardPayment extends PaymentSerivce {
    @Override
    default void pay(double amount) {
        System.out.println("Paying with debit card: " + amount);
    }
}
final class VisaDebitCard  implements DebitCardPayment {
    @Override
    public void pay(double amount) {
        System.out.println("Paying with debit card: " + amount);
    }
}
sealed  class CreditCardPayment implements PaymentSerivce permits HdfcCreditCardPayment, IciciCreditCardPayment{

    @Override
    public void pay(double amount) {
        System.out.println("Paying with credit card: " + amount);
    }
}

final class HdfcCreditCardPayment extends CreditCardPayment {
    @Override
    public void pay(double amount) {
        System.out.println("Paying with HDFC credit card: " + amount);
    }
}

final class IciciCreditCardPayment extends CreditCardPayment {
    @Override
    public void pay(double amount) {
        System.out.println("Paying with ICICI credit card: " + amount);
    }
}
public class SealedClassExa {
}
