public class PayPalPayment implements PaymentStrategy {
    @Override
    public String getPaymentType() {
        return "không dùng tiền mặt";
    }

    @Override
    public String getName() {
        return "PayPal";
    }

    @Override
    public void pay(double amount) {
        System.out.printf("Thanh toán %,.0f qua %s.%n", amount, getName());
    }
}