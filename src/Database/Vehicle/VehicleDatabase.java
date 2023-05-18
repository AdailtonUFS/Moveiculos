package src.Database.Vehicle;

import java.io.IOException;
import java.util.ArrayList;

import src.Database.Database;
import src.Vehicle.Vehicle;
import src.Vehicle.Air.Air;
import src.Vehicle.Air.Helicopter;
import src.Vehicle.Land.Land;
import src.Vehicle.Land.Truck;
import src.Vehicle.Maritime.Maritime;
import src.Vehicle.Maritime.Ship;

public class VehicleDatabase extends Database {
    private ArrayList<Truck> trucks;
    private ArrayList<Helicopter> helicopters;
    private ArrayList<Land> lands;
    private ArrayList<Maritime> mariners;
    private ArrayList<Ship> ships;
    private ArrayList<Air> airs;

    public VehicleDatabase() {
        super("Database/Arquivo.txt");

        TruckDatabase truckDatabase = new TruckDatabase();
        HelicopterDatabase helicopterDatabase = new HelicopterDatabase();
        LandDatabase landDatabase = new LandDatabase();
        MaritimeDatabase maritimeDatabase = new MaritimeDatabase();
        ShipDatabase shipDatabase = new ShipDatabase();
        AirDatabase AirDatabase = new AirDatabase();
        try {
            this.trucks = truckDatabase.getAllTruck();
            this.helicopters = helicopterDatabase.getAllHelicopter();
            this.lands = landDatabase.getAllLand();
            this.mariners = maritimeDatabase.getAllAir();
            this.ships = shipDatabase.getAllShip();
            this.airs = AirDatabase.getAllAir();
        } catch (Exception e) {
            System.out.println("Ocorreu um erro com o arquivo texto");
        }

    }

    public ArrayList<Vehicle> getAllVehicle() throws IOException {

        ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();

        vehicles.addAll(this.trucks);
        vehicles.addAll(this.helicopters);
        vehicles.addAll(this.lands);
        vehicles.addAll(this.mariners);
        vehicles.addAll(this.ships);
        vehicles.addAll(this.airs);

        return vehicles;
    }

    public ArrayList<Vehicle> internationalVehicles() {
        ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();

        vehicles.addAll(this.airs);
        vehicles.addAll(this.mariners);
        vehicles.addAll(this.ships);
        vehicles.addAll(this.helicopters);

        return vehicles;
    }

    public ArrayList<Vehicle> intercityVehicles() {
        ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();

        vehicles.addAll(this.trucks);
        vehicles.addAll(this.lands);

        return vehicles;
    }
    public ArrayList<Vehicle> interStateVehicles() {
        ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();

        vehicles.addAll(this.trucks);
        vehicles.addAll(this.helicopters);
        vehicles.addAll(this.lands);
        vehicles.addAll(this.airs);

        return vehicles;
    }
    public ArrayList<String> vehicleName(ArrayList<Vehicle> vehicles) throws IOException {
        ArrayList<String> names = new ArrayList<>();
        for (Vehicle dataItem : vehicles) {
            names.add(dataItem.getName() + " " + dataItem.getColor());
        }
        return names;
    }

}
