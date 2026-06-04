//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static void greet (String name) {
        System.out.println("Welcome! " + name);
    }

    static int add(int a, int b) {
        return a + b;
    }

    static int dob(int age) {
        return 2026 - age;
    }

    public static void main(String[] args) {

        //Variables with different data types
        String name = "Aaron";
        int age  = 23;
        double salary = 30000.0;
        boolean employed = false;

        //Using the greet method
        greet(name);

        //Using the add method
        int result = add(5, 10);
        System.out.println(result);


        int year = dob(age);
        System.out.println(year);

        System.out.println("\nPersonal Info:");
        Person p1 = new Person();
        p1.name = name;
        p1.age = age;
        p1.introduce();

        Person p2 = new Person();
        p2.name = "Sarah";
        p2.age = 28;
        p2.introduce();


        Car c1 = new Car();
        System.out.println("\nCars:");
        c1.make = "bmw";
        c1.model = "m140i";
        c1.year = 2018;
        c1.displayInfo();


        Book b1 = new Book();
        System.out.println("\nBooks:");
        b1.title = "Red Rising";
        b1.author = "Pierce Brown";
        b1.pages = 416;
        b1.displayBook();


        BankAccount account = new BankAccount();
        account.owner = name;
        System.out.println("\nBank Account:");
        account.showBalance();
        account.deposit(500);
        account.showBalance();
        account.deposit(-500);
        account.withdraw(200);
        account.showBalance();
        account.withdraw(-200);
        account.showBalance();
        account.withdraw(400);
        account.showBalance();


        Student student1 = new Student("Aaron", 85);
        System.out.println("\nStudent Grades:");
        student1.displayInfo();
        student1.setGrade(95);
        System.out.println("\nAfter update:");
        student1.displayInfo();


        // Testing Vehicle
        System.out.println("\nVehicle:");
        CarVe myCar = new CarVe("Toyota");
        Motorcycle myBike = new Motorcycle("Harley-Davidson");
        Van myVan = new Van("Ford");
        Lorry myLorry = new Lorry("Mercedes-Benz");

        // Testing Car
        myCar.displayType();
        myCar.start();
        myCar.stop();
        System.out.println(); // Blank line for spacing

        // Testing Motorcycle
        myBike.displayType();
        myBike.start();
        System.out.println();

        // Testing Van
        myVan.displayType();
        myVan.start();
        System.out.println();

        // Testing Lorry
        myLorry.displayType();
        myLorry.start();
        System.out.println();


        // Testing Shapes
        System.out.println("\nShapes:");
        Shape myCircle = new Circle(5.0);
        System.out.println("Circle Area: " + myCircle.calculateArea());

        Shape mySquare = new Square(7.0);
        System.out.println("Square Area: " + mySquare.calculateArea());

        Shape myRectangle = new Rectangle(4.0, 6.0);
        System.out.println("Rectangle Area: " + myRectangle.calculateArea());



    }
}