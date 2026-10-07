public class OfficeEmployee1 implements EmailSender {
    private String name;

    public OfficeEmployee1(String name) {
        this.name = name;
    }

    @Override
    public void sendEmail() {
        System.out.println(name + " đang gửi email văn phòng.");
    }
}