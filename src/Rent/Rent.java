package src.Rent;

import src.Person.Client;
import src.Person.Employee;
import src.Vehicle.Vehicle;
/**
 * Rent
 */
public class Rent {

    private final String vehicle;
    private final String client;
    private final String employee;
    private final String paymentMethod;
    private final Double value;

    public Rent(String vehicle, String client, String employee, String paymentMethod, Double value)
    {
        this.vehicle = vehicle;
        this.client = client;
        this.employee = employee;
        this.paymentMethod = paymentMethod;
        this.value = value;
    }

    public String toString() {
        return this.vehicle + ";" + this.client + ";" + this.employee + ";" + this.paymentMethod + ";" + this.value;
    }
    
}