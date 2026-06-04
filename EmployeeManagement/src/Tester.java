public class Tester extends Employee {

    // Constructor for the Tester class that takes a name and years of experience as parameters
    public Tester(String name, int yearsExperience) {
        super(name, 45000.0, yearsExperience);
    }

    // Method to calculate the salary of a Tester based on their base salary and experience level
    @Override
    public double calculateSalary() {
        return getBaseSalary() + (getYearsExperience() * 1000);
    }
}
