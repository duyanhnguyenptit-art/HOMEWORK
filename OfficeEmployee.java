public class OfficeEmployee extends Employee {
    private int workingDays;
    public static final double DAILY_RATE = 100;

    public OfficeEmployee(String name, int age, int workingDays) {
        super(name, age);
        this.workingDays = workingDays;
    }

    @Override
    public double calculateSalary() {
        return workingDays * DAILY_RATE;
    }
}