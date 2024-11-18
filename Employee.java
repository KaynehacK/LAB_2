import java.util.ArrayList;

import static java.lang.System.out;

public class Employee {
    String Name;
    Department Dep;

    public String getName() {
        return Name;
    }

    public String getDep() {
        return Dep.getName();
    }

    public String setName(String newName) {
        return Name = newName;
    }

    public void setDep(Department newDep) {
        if (Dep != null) Dep.removeEmployee(this);
        Dep = newDep;
        Dep.addEmployee(this);
    }

    public Employee(String name, Department dep) {
        Name = name;
        Dep = dep;
        Dep.addEmployee(this);
        out.println("Employee created. Name: " + Name + ".");
    }

    public Employee(String name) { this(name, null); }

    public void setSuperior() {
        this.Dep.setSuperior(this);
    }

    public String getEmployee() {
        if (Dep.Superior != this) { return Name + ", работает в отделе " + Dep.getName() + ", начальник которого - " + Dep.getSuperior() + "."; }
        else { return Name + ", начальник отдела " + Dep.getName() + "."; }
    }

    public ArrayList<Employee> getList() {
        if (Dep != null) { return Dep.getEmployees(); }
        else { return null; }
    }

    public void printList()
    {
        out.printf("Отдел %s, cписок сотдудников:\n", this.Dep.getName());
        for (Employee emp : getList()) {
            out.printf("%s\n",emp.getName());
        }
    }
}
