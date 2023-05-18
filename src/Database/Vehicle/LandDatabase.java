package src.Database.Vehicle;

import java.io.IOException;
import java.util.ArrayList;

import src.Database.Database;
import src.Vehicle.Land.Land;

public class LandDatabase extends Database{

    public LandDatabase() {
        super("Database/Land.txt");
    }

    public ArrayList<Land> getAllLand() throws IOException {
        ArrayList<String> data = this.getAll();
        ArrayList<Land> lands = new ArrayList<Land>();

        for (String dataItem : data) {
            String[] dataArray = dataItem.split(";");

            Land Land = new Land(dataArray[0],
                    dataArray[1],
                    dataArray[2],
                    Double.parseDouble(dataArray[3]),
                    Double.parseDouble(dataArray[4]),
                    Double.parseDouble(dataArray[5])
            );
            lands.add(Land);
        }
        return lands;
    }
    
}
