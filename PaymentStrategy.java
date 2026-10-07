public interface PaymentStrategy {
    String getPaymentType();
    String getName();
    void pay(double amount);
}