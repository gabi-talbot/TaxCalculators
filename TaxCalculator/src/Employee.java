

public class Employee {
    // attributes
    private String name;
    private double salary;

    //constructor
    public Employee(String name, double salary){
        setName(name);
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setSalary(double salary) {
        if (salary <=0)
            throw new IllegalArgumentException("Salary cannot be 0 or less.");
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }



}
