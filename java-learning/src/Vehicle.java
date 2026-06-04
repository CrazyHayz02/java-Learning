import java.util.Vector;

public class Vehicle {
    protected String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }


    public void start() {
        System.out.println("The vehicle is starting... Vroom!");
    }

    public void stop() {
        System.out.println("The vehicle has stopped.");
    }
}

class CarVe extends Vehicle {
    public CarVe(String brand) {
        super(brand);
    }
    public void displayType() {
        System.out.println("Type: This is a " + brand + " Car.");
    }
}

class Motorcycle extends Vehicle {
    public Motorcycle(String brand) {
        super(brand);
    }
    public void displayType() {
        System.out.println("Type: This is a " + brand + " Motocycle.");
    }
}

class Van extends Vehicle {
    public Van(String brand) {
        super(brand);
    }
    public void displayType() {
        System.out.println("Type: This is a " + brand + " Van.");
    }
}

class Lorry extends Vehicle {
    public Lorry(String brand) {
        super(brand);
    }
    public void displayType() {
        System.out.println("Type: This is a " + brand + " Lorry.");
    }
}



