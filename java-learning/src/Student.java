public class Student {
    private String name;
    private int grade;

    public Student(String name, int grade) {
        this.name = name;
        if (grade >= 0 && grade <= 100) {
            this.grade = grade;
        } else {
            this.grade = 0;
            System.out.println("Invalid grade. Set to 0.");
        }
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(int grade) {
        if (grade >= 0 && grade <= 100) {
            this.grade = grade;
        } else {
            System.out.println("Grade must be between 0 and 100.");
        }
    }

    public void displayInfo() {

        System.out.println("Name: " + name);
        System.out.println("Grade: " + grade);
    }
}
