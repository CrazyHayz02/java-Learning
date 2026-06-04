public class Student {
    private String name;
    private int grade;

    // Constructor for Student class
    public Student(String name, int grade) {
        this.name = name;
        if (grade >= 0 && grade <= 100) {
            this.grade = grade;
        } else {
            this.grade = 0;
            System.out.println("Invalid grade. Set to 0.");
        }
    }

    // Getter methods for name and grade
    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    // Setter methods for name
    public void setName(String name) {
        this.name = name;
    }

    // Setter methods for grade
    public void setGrade(int grade) {
        if (grade >= 0 && grade <= 100) {
            this.grade = grade;
        } else {
            System.out.println("Grade must be between 0 and 100.");
        }
    }

    // Method to display student information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Grade: " + grade);
    }
}
