package main.java.main;

public class Plane extends Vehicle {
    
    public Plane (String manufacturer, String model, int maxSpeed) {
        super("plane", manufacturer, model, maxSpeed);
        setEngine(new Engine("Suihkumoottori", 500));
        System.out.println("Lentokone luotu!");
    }

    public void fly() {
        System.out.println(manufacturer + " " + model + " lentää kohteeseen!");
    }
}
