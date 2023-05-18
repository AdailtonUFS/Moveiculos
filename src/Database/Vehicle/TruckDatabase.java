package src.Database.Vehicle;

import java.io.IOException;
import java.util.ArrayList;

import src.Database.Database;
import src.Vehicle.Land.Truck;

public class TruckDatabase extends Database{

    public TruckDatabase() {
        super("Database/Truck.txt");
    }

    public ArrayList<Truck> getAllTruck() throws IOException {
        ArrayList<String> data = this.getAll();
        ArrayList<Truck> trucks = new ArrayList<Truck>();

        for (String dataItem : data) {
            String[] dataArray = dataItem.split(";");

            Truck Truck = new Truck(dataArray[0],
                    dataArray[1],
                    dataArray[2],
                    Double.parseDouble(dataArray[3]),
                    Double.parseDouble(dataArray[4]),
                    Double.parseDouble(dataArray[5]),
                    Double.parseDouble(dataArray[6])
            );
            trucks.add(Truck);
        }
        return trucks;
    }
}
