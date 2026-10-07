public class TechnicalEmployee extends Employee {
    private double workingHours;
    private double hourlyRate;

    public TechnicalEmployee(String name, int age, double workingHours, double hourlyRate) {
        super(name, age);
        this.workingHours = workingHours;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return workingHours * hourlyRate;
    }
}