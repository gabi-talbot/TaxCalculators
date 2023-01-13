# TaxCalculators
## To calculate UK tax on employees salaries in different financial years

The project has been created using **OOP principles**: 

* Encapsulation - every class has a single responsibility
* Abstraction - unnecessary details, such as direct access to employee salary, are hidden from the user
* Inheritance - code is re-used where needed
* Polymorphism - calulateTax method is overidden for each calculator

Furthermore, a  **Java interface** is used - a Tax Calculator, which is implemeted by the calculators themselves. This allows the user to generate a tax report for an employee for different years without having to re-define the TaxReport class.

The calculators demonstrate **dependency injection** where the class initialises an Employee object which is passed to it's constructor. It is the employee object that is created in main that is passed to the calculators and this seperation of concerns will help make any future testing easier.
