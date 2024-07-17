package main.java.main;

public class Car extends Vehicle {
    
    public Car(String manufacturer, String model, int maxSpeed) {
        super("car", manufacturer, model, maxSpeed);
        setEngine(new Engine("V8", 300));
        System.out.println("Auto luotu!");
    }

    public void drive() {
        System.out.println(manufacturer + " " + model + " paahtaa tietä eteenpäin!");
    }
}
