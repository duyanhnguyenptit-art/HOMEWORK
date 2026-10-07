public class Main1 {
    public static void main(String[] args) {
        OfficeEmployee1 officeEmp = new OfficeEmployee1("An");
        TechnicalEmployee1 techEmp = new TechnicalEmployee1("Bình");
        SalesEmployee1 salesEmp = new SalesEmployee1("Cường");

        officeEmp.sendEmail();

        techEmp.code();
        techEmp.sendEmail();

        salesEmp.sell();
        salesEmp.sendEmail();
    }
}