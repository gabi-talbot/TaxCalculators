
import java.text.NumberFormat;

public class TaxReport {
    private final NumberFormat currency;
    private final Employee employee;
    private final TaxCalculator calculator;

    // constructor sets above fields via dependency injection
    public TaxReport(TaxCalculator calculator, Employee employee) {
        this.calculator = calculator;
        this.employee = employee;
        currency = NumberFormat.getCurrencyInstance();
    }

    public void displayTax() {
        var tax = calculator.calculateTax();
        System.out.println("Income Tax for 2022:" );
        System.out.println(currency.format(tax));
    }
    public void displaySalary(){
        var salary = employee.getSalary();
        System.out.println("Salary for " + employee.getName() +":");
        System.out.println(currency.format(salary));
    }
}
