public class Manager extends Employee {

    // Constructor for the Manager class that takes a name and years of experience as parameters
    public Manager(String name, int yearsExperience) {
        super(name, 70000.0, yearsExperience);
    }

    // Method to calculate the salary of a Manager based on their base salary and experience level
    @Override
    public double calculateSalary() {
        return getBaseSalary() + (getYearsExperience() * 3000);
    }
}