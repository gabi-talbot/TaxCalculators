

public class TaxCalculator2022 implements TaxCalculator{
    // Initialise Employee object
    private Employee employee;
    // constructor (use generator), initialises the instance fields above
    // - example of dependency injection
    public TaxCalculator2022(Employee employee) {
        this.employee = employee;
    }

    @Override
    public double calculateTax() {
        double tax = 0;

        if (employee.getSalary() <= 12570)
            tax = 0;
        else if (employee.getSalary() <= 50270)
            tax = (employee.getSalary() - 12570) * 0.2;
        else if (employee.getSalary() <= 125140) {
            tax = (employee.getSalary() - 50270) * 0.4;
            tax += (50270 - 12570) * 0.2;
        } else if (employee.getSalary() <= 150000) {
            tax = (employee.getSalary() - 50270) * 0.4;
            tax += 50270 * 0.2;
        } else {
            tax = (employee.getSalary() - 150000) * 0.45;
            tax += (150000 - 37701) * 0.4;
            tax += 37700 * 0.2;
        }
        return tax;
    }
}
