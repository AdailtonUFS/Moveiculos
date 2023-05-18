package src.Database.Vehicle;

import java.io.IOException;
import java.util.ArrayList;

import src.Database.Database;
import src.Vehicle.Air.Helicopter;

public class HelicopterDatabase extends Database {

    public HelicopterDatabase() {
        super("Database/Helicopter.txt");
    }

    public ArrayList<Helicopter> getAllHelicopter() throws IOException {
        ArrayList<String> data = this.getAll();
        ArrayList<Helicopter> helicopters = new ArrayList<Helicopter>();

        for (String dataItem : data) {
            String[] dataArray = dataItem.split(";");

            Helicopter Helicopter = new Helicopter(dataArray[0],
                    dataArray[1],
                    dataArray[2],
                    Double.parseDouble(dataArray[3]),
                    Double.parseDouble(dataArray[4]),
                    Double.parseDouble(dataArray[5]),
                    Integer.parseInt(dataArray[6]),
                    Integer.parseInt(dataArray[6]));
            helicopters.add(Helicopter);
        }
        return helicopters;
    }

}
