public class Employee {

    private String name;
    private double salary;
    private int yearsExperience;

    public Employee(String name, double salary, int yearsExperience) {
        this.name = name;
        this.salary = salary;
        this.yearsExperience = yearsExperience;
    }

    public double calculateSalary() {
        return this.salary;
    }

    public String getName() {
        return name;
    }

    public double getBaseSalary() {
        return salary;
    }

    public int getYearsExperience() {
        return yearsExperience;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + " | Emperience: " + yearsExperience + " years");
    }
}
