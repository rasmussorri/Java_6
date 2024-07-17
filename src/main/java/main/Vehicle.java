package main.java.main;

public class Vehicle {
    private String type;
    protected String manufacturer;
    protected String model;
    protected int maxSpeed;
    protected Engine engine;

    public Vehicle (String type, String manufacturer, String model, int maxSpeed) {
        this.type = type;
        this.manufacturer = manufacturer;
        this.model = model;
        this.maxSpeed = maxSpeed;
    }
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getVehicle() {
        if(type == "car"){
            return "Auto: " + manufacturer + " " + model;
        } else if(type == "plane") {
            return "Lentokone: " + manufacturer + " " + model;
        } else if(type == "ship") {
            return "Laiva: " + manufacturer + " " + model;
        }
        return "";
    }

    public String getEngine() {
        return "Moottori: " + engine.getName() + " " + engine.getPower() + "kW";
    }

    public String getMaxSpeed() {
        return "Huippunopeus: " + maxSpeed + "km/h";
    }

    public String getSpecs() {
        return manufacturer + " " + model;
    }
}
