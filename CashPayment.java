public class CashPayment implements PaymentStrategy {
    @Override
    public String getPaymentType() {
        return "trực tiếp";
    }

    @Override
    public String getName() {
        return "tiền mặt";
    }

    @Override
    public void pay(double amount) {
        System.out.printf("Thanh toán %,.0f bằng %s.%n", amount, getName());
    }
}