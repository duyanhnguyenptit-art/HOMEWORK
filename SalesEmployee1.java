public class SalesEmployee1 implements EmailSender, Salesperson {
    private String name;

    public SalesEmployee1(String name) {
        this.name = name;
    }

    @Override
    public void sendEmail() {
        System.out.println(name + " đang gửi email báo giá.");
    }

    @Override
    public void sell() {
        System.out.println(name + " đang tư vấn bán hàng.");
    }
}