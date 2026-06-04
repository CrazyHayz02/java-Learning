public class Developer extends Employee {
    public Developer(String name, int yearsExperience) {
        super(name, 50000.0, yearsExperience);
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + (getYearsExperience() * 2000);
    }
}