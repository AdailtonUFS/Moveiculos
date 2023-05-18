package src.Database.Person;

import java.io.IOException;
import java.util.ArrayList;

import src.Database.Database;
import src.Person.Client;

public class ClientDatabase extends Database {

    public ClientDatabase() {
        super("Database/Clients.txt");
    }

    public ArrayList<Client> getAllClients() throws IOException {
        ArrayList<String> data = this.getAll();
        ArrayList<Client> clients = new ArrayList<Client>();

        for (String dataItem : data) {
            String[] dataArray = dataItem.split(";");

            Client client = new Client(dataArray[0], Integer.parseInt(dataArray[1]), dataArray[2], dataArray[3], dataArray[4]);
            clients.add(client);
        }
        return clients;
    }

    public ArrayList<String> clientCPFS() throws IOException {
        ArrayList<String> data = this.getAll();
        ArrayList<String> cpfs = new ArrayList<>();
        for (String dataItem : data) {
            String[] dataArray = dataItem.split(";");

            cpfs.add(dataArray[3]);
        }
        return cpfs;
    }

    public Client getByCPF(String CPF) throws IOException {
        ArrayList<Client> clients = this.getAllClients();

        for (Client client : clients) {
            if (client.getCPF().equals(CPF)) {
                return client;
            }
        }
        return null;
    }

    public boolean emailExists(String email) throws IOException {
        ArrayList<String> data = this.getAll();

        for (String dataItem : data) {
            String[] dataArray = dataItem.split(";");
            if (dataArray[2].equals(email)) {
                return true;
            }
        }
        return false;
    }

    public boolean cpfExists(String cpf) throws IOException {
        ArrayList<String> data = this.getAll();
        for (String dataItem : data) {
            String[] dataArray = dataItem.split(";");
            if (dataArray[3].equals(cpf)) {
                return true;
            }
        }
        return false;
    }
}
