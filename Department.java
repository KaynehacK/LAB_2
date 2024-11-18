import static java.lang.System.out;
import java.util.ArrayList;

public class Department {
    String Name;
    Employee Superior;
    ArrayList<Employee> Employees =  new ArrayList<>(0);

    public String getName() { return Name; }

    public String getSuperior() { return Superior.getName(); }

    public ArrayList<Employee> getEmployees() { return Employees; }

    public String setName(String newName) { return Name = newName; }

    public void addEmployee(Employee e) {
        Employees.add(e);
        out.println("Employee " + e.getName() +" has been added to the department " + Name + ".");
    }

    public void removeEmployee(Employee e) {
        Employees.remove(e);
        out.println("Employee " + e.getName() +" has been removed from the department " + Name + ".");
    }

    public void setSuperior(Employee superior) {
        Superior = superior;
        out.println("Superior of " + Name + " has been changed to " + superior.getName() + ".");
    }

    public Department(String newName) {
        Name = newName; Superior = null;
        out.println("Department created. Name: " + Name + ".");
    }
}
