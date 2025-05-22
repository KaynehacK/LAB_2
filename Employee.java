/*
 * Задание №2.4. Сотрудники и отделы.
 * Создайте сущность Сотрудник, которая описывается именем (в строковой форме) и отделом, в
 * котором сотрудник работает, причем у каждого отдела есть название и начальник, который
 * также является Сотрудником. Сотрудник может быть приведен к текстовой форме вида: “Имя
 * работает в отделе Название, начальник которого Имя”. В случае если сотрудник является
 * руководителем отдела, то текстовая форма должна быть “Имя начальник отдела Название”.
 * Необходимо выполнить следующие задачи:
 * 1. Создать Сотрудников Петрова, Козлова, Сидорова работающих в отделе IT.
 * 2. Сделать Козлова начальником IT отдела.
 * 3. Вывести на экран текстовое представление всех трех Сотрудников (у всех троих должен
 * оказаться один и тот же отдел и начальник).
 *
 * Задание №3.4. Сотрудники и отделы.
 * Измените решение, полученное в задаче 2.4 таким образом, чтобы имея ссылку на сотрудника,
 * можно было бы узнать список всех сотрудников этого отдела.
 */

import java.util.ArrayList;

public class Employee {
    private String name;
    private Department department;

    public String getName() {
        return name;
    }
    public String setName(String newName) {
        return name = newName;
    }

    public Department getDepartment() {
        return department;
    }
    public void setDepartment(Department newDepartment) {
        if (department != null) department.removeEmployee(this);
        department = newDepartment;
        department.addEmployee(this);
    }

    public Employee(String name, Department department) {
        this.name = name;
        this.department = department;
        this.department.addEmployee(this);
    }
    public Employee(String name) {
        this(name, null);
    }

    public void setSuperior() {
        this.department.setSuperior(this);
    }

    public ArrayList<Employee> getList() {
        if (department != null) { return department.getEmployees(); }
        else { return null; }
    }

    @Override
    public String toString() {
        if (department.getSuperior() != null && department.getSuperior() != this) {
            return name
                    + ", работает в отделе "
                    + department.getName()
                    + ", начальник которого - "
                    + department.getSuperior()
                    + ".";
        } else if (department.getSuperior() != null) {
            return name + ", начальник отдела " + department.getName() + ".";
        } else {
            return name
                    + ", работает в отделе "
                    + department.getName()
                    + ", начальник которого не назначен";
        }
    }
}
