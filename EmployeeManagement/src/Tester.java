public class Tester extends Employee {
    public Tester(String name, int yearsExperience) {
        super(name, 45000.0, yearsExperience);
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + (getYearsExperience() * 1000);
    }
}
