import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*Employee[] team = new Employee[3];

        // Populate the array with our employee objects
        team[0] = new Developer("Tom", 5);
        team[1] = new Tester("Sarah", 3);
        team[2] = new Manager("Alice", 8);*/

        // Print out the names of all employees in our array
        ArrayList<Employee> team = new ArrayList<>();

        // Populate the array with our employee objects
        team.add(new Developer("Tom", 5));
        team.add(new Tester("Sarah", 3));
        team.add(new Manager("Alice", 8));
        team.add(new Developer("Jon", 2));
        team.add(new Tester("Mike", 4));
        team.add(new Developer("Jim", 1));
        team.add(new Tester("Jack", 6));
        team.add(new Developer("Sam", 3));
        team.add(new Tester("Tommy", 2));
        team.add(new Developer("Mike", 4));
        team.add(new Developer("Alice", 8));
        team.add(new Tester("Mike", 4));
        team.add(new Developer("Mike", 4));
        team.add(new Tester("Mike", 4));


        System.out.println("=== EMPLOYEE MANAGEMENT SYSTEM ===\n");

        // Display the Details of all employees in our array
        for (Employee emp : team) {
            emp.displayInfo();
            System.out.println("Role: " + emp.getClass().getSimpleName());
            System.out.println("Final Calculated Salary: £" + emp.calculateSalary());
            System.out.println("------------------------------------");
        }
        

    }
}