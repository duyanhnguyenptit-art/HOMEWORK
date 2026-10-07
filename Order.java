public class Order {
    private String customerName;
    private double amount;
    private PaymentStrategy paymentMethod;

    public Order(String customerName, double amount, PaymentStrategy paymentMethod) {
        this.customerName = customerName;
        this.amount = amount;
        this.paymentMethod = paymentMethod;
    }

    public void checkout() {
        System.out.println("Khách hàng: " + customerName);
        paymentMethod.pay(amount);
        System.out.println();
    }
}