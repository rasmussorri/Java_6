package main;

import java.util.ArrayList;
import java.util.Scanner;
import main.java.main.Car;
import main.java.main.Plane;
import main.java.main.Ship;
import main.java.main.Vehicle;

public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Vehicle> vehicles = new ArrayList<>();

        boolean exit = false;

        while(!exit) {
            System.out.println("1) Luo uusi kulkuneuvo, 2) Listaa kulkuneuvot 3) Aja autoja, 4) Lennä lentokoneita, 5) Seilaa laivoja, 0) Lopeta ohjelma");

            if(sc.hasNext()){
                int i = 0;
                String stringInput = sc.nextLine();
                i = Integer.parseInt(stringInput);
            
                switch (i) {
                    case 1:
                        System.out.println("Minkä kulkuneuvon haluat rakentaa? 1) auto, 2) lentokone, 3) laiva");
                        int j = 0;
                        String stringInput2 = sc.nextLine();
                        j = Integer.parseInt(stringInput2);
                        System.out.println("Anna kulkuneuvon valmistaja:");
                        String manufacturer = sc.nextLine();
                        System.out.println("Anna kulkuneuvon malli:");
                        String model = sc.nextLine();
                        System.out.println("Anna kulkuneuvon huippunopeus:");
                        String maxSpeedString = sc.nextLine();
                        int maxSpeed = Integer.parseInt(maxSpeedString);

                        switch (j) {
                            case 1:
                                Car c = new Car(manufacturer, model, maxSpeed);
                                vehicles.add(c);
                                break;
                            
                            case 2:
                                Plane p = new Plane(manufacturer, model, maxSpeed);
                                vehicles.add(p);
                                break;

                            case 3:
                                Ship s = new Ship(manufacturer, model, maxSpeed);
                                vehicles.add(s);
                                break;

                            default:
                                System.out.println("Väärä syöte");
                                break;
                        }
                        break;
                    
                    case 2:
                        for (Vehicle v : vehicles) {
                            System.out.println(v.getVehicle());
                            System.out.println(v.getEngine());
                            System.out.println(v.getMaxSpeed());
                            System.out.println();
                        }
                        break;

                    case 3:
                        for (Vehicle v : vehicles) {
                            if(v instanceof Car) {
                                ((Car) v).drive();
                            }
                        }
                        break;
                    
                    case 4:
                        for (Vehicle v : vehicles) {
                            if(v instanceof Plane) {
                                ((Plane) v).fly();
                            }
                        }
                        break;

                    case 5:
                        for (Vehicle v : vehicles) {
                            if(v instanceof Ship) {
                                ((Ship) v).sail();
                            }
                        }
                        break;

                    case 0:
                        System.out.println("Kiitos ohjelman käytöstä.");
                        exit = true;
                        break;

                    default:
                        System.out.println("Syöte oli väärä");
                        break;
                }
            }
        }
        sc.close();
    }
}
