public class Main2 {
    public static void main(String[] args) {
        Order order1 = new Order("An", 200000, new CreditCardPayment());
        Order order2 = new Order("Bình", 150000, new PayPalPayment());
        Order order3 = new Order("Chi", 100000, new CashPayment());
        Order order4 = new Order("Dũng", 300000, new MoMoPayment());

        order1.checkout();
        order2.checkout();
        order3.checkout();
        order4.checkout();
    }
}