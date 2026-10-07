public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[] {
            new OfficeEmployee("An", 25, 22),
            new TechnicalEmployee("Bình", 30, 160, 15)
        };

        for (Employee emp : employees) {
            emp.displayInfo();
        }
    }
}