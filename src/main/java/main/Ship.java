package main.java.main;

public class Ship extends Vehicle {
    
    public Ship(String manufacturer, String model, int maxSpeed) {
        super("ship", manufacturer, model, maxSpeed);
        setEngine(new Engine("Wärtsilä Super", 1000));
    }

    public void sail() {
        System.out.println(manufacturer + " " + model + " seilaa merten ääriin!");
    }
}
