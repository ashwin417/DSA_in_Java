package Module2.course5_assignment;

class Vehicle {
    private String make;
    private String model;

    public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }
    public void startEngine(){
        System.out.println("Starting Engine of a vehicle");
    }
    public void display(){
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
    }
}

class car extends Vehicle{
    public car(String make, String model){
        super(make, model);
    }
    public void startEngine(){
        System.out.println("Starting Engine of the car");
    }
}

class Motorcycle extends Vehicle{
    public Motorcycle(String make, String model){
        super(make, model);
    }
    public void startEngine(){
        System.out.println("Starting Engine of the motorcycle");
    }
}

public class question1{
    public static void main(String[] args) {
        Vehicle car = new car("Tata", "Indica");
        car.display();
        car.startEngine();

        System.out.println();

        Vehicle motorcycle = new Motorcycle("Hero", "Xpulse");
        motorcycle.display();
        motorcycle.startEngine();
    }
}