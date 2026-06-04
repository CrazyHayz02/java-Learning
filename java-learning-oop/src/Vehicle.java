import java.util.Vector;

// Parent Class for vehicles
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

// Child class for Cars
class CarVe extends Vehicle {
    public CarVe(String brand) {
        super(brand);
    }
    public void displayType() {
        System.out.println("Type: This is a " + brand + " Car.");
    }
}

// Child class for Motorcycles
class Motorcycle extends Vehicle {
    public Motorcycle(String brand) {
        super(brand);
    }
    public void displayType() {
        System.out.println("Type: This is a " + brand + " Motocycle.");
    }
}

// Child class for Vans
class Van extends Vehicle {
    public Van(String brand) {
        super(brand);
    }
    public void displayType() {
        System.out.println("Type: This is a " + brand + " Van.");
    }
}

// Child class for Lorry
class Lorry extends Vehicle {
    public Lorry(String brand) {
        super(brand);
    }
    public void displayType() {
        System.out.println("Type: This is a " + brand + " Lorry.");
    }
}



