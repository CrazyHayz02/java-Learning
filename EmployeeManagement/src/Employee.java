public class Employee {

    // Attributes of the Employee class
    private String name;
    private double salary;
    private int yearsExperience;

    // Constructor for the Employee class
    public Employee(String name, double salary, int yearsExperience) {
        this.name = name;
        this.salary = salary;
        this.yearsExperience = yearsExperience;
    }

    // Method to calculate the base salary of an employee
    public double calculateSalary() {
        return this.salary;
    }

    // Getters for the Employee class
    public String getName() {
        return name;
    }

    // Setter for the Employee class
    public double getBaseSalary() {
        return salary;
    }

    // Getter for the Employee class
    public int getYearsExperience() {
        return yearsExperience;
    }

    // Method to display information about an employee
    public void displayInfo() {
        System.out.println("Name: " + name + " | Emperience: " + yearsExperience + " years");
    }
}
