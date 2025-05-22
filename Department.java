/*
 * Задание №2.4. Сотрудники и отделы.
 * Задание №3.4.
 */

import java.util.ArrayList;

public class Department {
    private String name;
    private Employee superior;
    private ArrayList<Employee> employees =  new ArrayList<>(0);

    public String getName() {
        return name;
    }
    public String setName(String newName) {
        return name = newName;
    }

    public Employee getSuperior() {
        return superior;
    }
    public void setSuperior(Employee employee) {
        superior = employee;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }


    public void addEmployee(Employee e) {
        employees.add(e);
    }

    public void removeEmployee(Employee e) {
        employees.remove(e);
    }


    public Department(String newName) {
        name = newName; superior = null;
    }
}
