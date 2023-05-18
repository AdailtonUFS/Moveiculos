package src.Database.Person;

import java.io.IOException;
import java.util.ArrayList;

import src.Database.Database;
import src.Person.Employee;

public class EmployeeDatabase extends Database {
    public EmployeeDatabase() {
        super("Database/Employees.txt");
    }

    public ArrayList<Employee> getAllEmployees() throws IOException {
        ArrayList<String> data = this.getAll();
        ArrayList<Employee> employees = new ArrayList<Employee>();

        for (String dataItem : data) {
            String[] dataArray = dataItem.split(";");

            Employee employee = new Employee(dataArray[0], Integer.parseInt(dataArray[1]), dataArray[2], dataArray[3], dataArray[4]);
            employees.add(employee);
        }
        return employees;
    }

    public ArrayList<String> employeeCPFS() throws IOException {
        ArrayList<String> data = this.getAll();
        ArrayList<String> cpfs = new ArrayList<>();
        for (String dataItem : data) {
            String[] dataArray = dataItem.split(";");

            cpfs.add(dataArray[3]);
        }
        return cpfs;
    }

    public Employee getByCPF(String CPF) throws IOException {
        ArrayList<Employee> employess = this.getAllEmployees();

        for (Employee employee : employess) {
            if (employee.getCPF().equals(CPF)) {
                return employee;
            }
        }
        return null;
    }
}
