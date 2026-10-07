public class CreditCardPayment implements PaymentStrategy {
    @Override
    public String getPaymentType() {
        return "không dùng tiền mặt";
    }

    @Override
    public String getName() {
        return "thẻ tín dụng";
    }

    @Override
    public void pay(double amount) {
        System.out.printf("Thanh toán %,.0f bằng %s.%n", amount, getName());
    }
}