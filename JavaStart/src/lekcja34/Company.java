package lekcja34;

import java.util.HashMap;
import java.util.Map;

public class Company {

    Map<String, Employee> employees = new HashMap<>();

    public void addEmployee(String name, String surname, int salary){
        employees.put(surname + surname, new Employee(name, surname, salary));
    }

    public Employee getEmployee(String name, String surname){
        return employees.get(surname + surname);
    }

}
