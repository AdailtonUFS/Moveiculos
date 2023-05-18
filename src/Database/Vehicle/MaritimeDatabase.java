package src.Database.Vehicle;

import java.io.IOException;
import java.util.ArrayList;

import src.Database.Database;
import src.Vehicle.Maritime.Maritime;

public class MaritimeDatabase extends Database {

    public MaritimeDatabase() {
        super("Database/Maritime.txt");
    }

    public ArrayList<Maritime> getAllAir() throws IOException {
        ArrayList<String> data = this.getAll();
        ArrayList<Maritime> mars = new ArrayList<Maritime>();

        for (String dataItem : data) {
            String[] dataArray = dataItem.split(";");

            Maritime Maritime = new Maritime(dataArray[0],
                    dataArray[1],
                    dataArray[2],
                    Double.parseDouble(dataArray[3]),
                    Double.parseDouble(dataArray[4]),
                    Double.parseDouble(dataArray[5]));
            mars.add(Maritime);
        }
        return mars;
    }
}
