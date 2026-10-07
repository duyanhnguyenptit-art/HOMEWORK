public class TechnicalEmployee1 implements EmailSender, Programmer {
    private String name;

    public TechnicalEmployee1(String name) {
        this.name = name;
    }

    @Override
    public void sendEmail() {
        System.out.println(name + " đang gửi email báo cáo kỹ thuật.");
    }

    @Override
    public void code() {
        System.out.println(name + " đang viết code.");
    }
}