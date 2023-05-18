package src.Database.Vehicle;

import java.io.IOException;
import java.util.ArrayList;

import src.Database.Database;
import src.Vehicle.Maritime.Ship;

public class ShipDatabase extends Database {

    public ShipDatabase() {
        super("Database/Ship.txt");
    }

    public ArrayList<Ship> getAllShip() throws IOException {
        ArrayList<String> data = this.getAll();
        ArrayList<Ship> ships = new ArrayList<Ship>();

        for (String dataItem : data) {
            String[] dataArray = dataItem.split(";");

            Ship Ship = new Ship(dataArray[0],
                    dataArray[1],
                    dataArray[2],
                    Double.parseDouble(dataArray[3]),
                    Double.parseDouble(dataArray[4]),
                    Double.parseDouble(dataArray[5]),
                    Double.parseDouble(dataArray[6]));
            ships.add(Ship);
        }
        return ships;
    }

}
