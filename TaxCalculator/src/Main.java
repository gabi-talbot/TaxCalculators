

public class Main {


    public static void main(String[] args) {
        // creates the employee and calculator objects
       var emp1 = new Employee("Gabi", 158000);
       var calculator = new TaxCalculator2022(emp1);
       // injects those objects in to the report constructor
       var report = new TaxReport(calculator, emp1);

       report.displaySalary();
       report.displayTax();


    }
}
