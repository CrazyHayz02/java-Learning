public class Manager extends Employee {
    public Manager(String name, int yearsExperience) {
        super(name, 70000.0, yearsExperience);
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + (getYearsExperience() * 3000);
    }
}