public class Developer extends Employee {

    // Constructor for the Developer class
    public Developer(String name, int yearsExperience) {
        super(name, 50000.0, yearsExperience);
    }

    // Method to calculate the salary of a Developer based on their base salary and experience level
    @Override
    public double calculateSalary() {
        return getBaseSalary() + (getYearsExperience() * 2000);
    }
}