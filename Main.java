import static java.lang.System.out;
import java.util.Scanner;

public class Main {

    public static int inputInt() {
        return inputInt(Integer.MIN_VALUE,Integer.MAX_VALUE);
    }

    public static int inputInt(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        int input;
        String inputLine;

        while (true) {
            inputLine = scanner.nextLine();
            try {
                input = Integer.parseInt(inputLine);
                if ( min <= input && input <= max ) {
                    return input;
                } else {
                    out.printf("The number is out of bounds. Please try again.\n");
                }
            } catch (NumberFormatException e) {
                out.printf("Invalid input. Please try again.\n");
            }
        }
    }

    public static String inputString() {
        return inputString(0,Integer.MAX_VALUE);
    }

    public static String inputString(int minLength, int maxLength){
        Scanner scanner = new Scanner(System.in);
        String string;
        while (true) {
            string = scanner.nextLine();
            if (string.length() >= minLength && string.length() <= maxLength) {
                return string;
            } else {
                out.printf("Invalid amount of characters. Please try again.\n");
            }
        }
    }

    public static void main(String[] args) {

        out.printf(
                "Enter a code of task in accordance with a table:\n" +
                "Task code:\t| 1 | 2 | 3 | 4 | 5 | 6 |\n" +
                "Task number:|1.2|1.3|2.4|3.4|4.5|5.1|\n" +
                "Code of task: ");

        switch (inputInt(1,6))
        {
            case 1:
                out.println("Задание 1.2. Сущность \"Человек\".");
                Person person1 = new Person("Клеопатра", 152);
                Person person2 = new Person("Пушкин", 167);
                Person person3 = new Person("Владимир", 189);
                out.println(person1);
                out.println(person2);
                out.println(person3);
                break;
            case 2:
                out.println("Задание 1.3. Сущность \"Имя\".");
                Names name1 = new Names("Клеопатра");
                Names name2 = new Names("Пушкин", "Александр", "Сергеевич");
                Names name3 = new Names("Маяковский", "Владимир");
                out.println(name1);
                out.println(name2);
                out.println(name3);
                break;
            case 3:
                out.println("Задание 2.4. Сотрудники и отделы. Каждому отделу соответствует один начальнк.");
                Department d1 = new Department("IT");
                Employee employee1 = new Employee("Петров", d1);
                Employee employee2 = new Employee("Козлов", d1);
                Employee employee3 = new Employee("Сидоров", d1);
                employee2.setSuperior();
                out.println(employee1);
                out.println(employee2);
                out.println(employee3);
                break;
            case 4:
                out.println("Задание 3.4. Сотрудники и отделы. Вывод списка всех сотрудников отдела.");
                Department department1 = new Department("IT");
                Employee employee4 = new Employee("Петров", department1);
                Employee employee5 = new Employee("Козлов", department1);
                Employee employee6 = new Employee("Сидоров", department1);
                out.println(employee4);
                out.println(employee5);
                out.println(employee6);
                employee5.setSuperior();
                out.println(employee5);
                System.out.printf("Отдел %s, cписок сотдудников:\n", employee6.getDepartment().getName());
                for (Employee employee : employee6.getList()) {
                    System.out.printf("%s\n", employee.getName());
                }
                break;
            case 5:
                out.println("Задание 4.5. Сущность \"Имя\", дополнение.");
                Names name4 = new Names("Клеопатра");
                Names name5 = new Names("Сергеевич", "Александр", "Пушкин");
                Names name6 = new Names("Владимир", "Маяковский");
                Names name7 = new Names("Христофор", "Бонифатьевич");
                out.println(name4);
                out.println(name5);
                out.println(name6);
                out.println(name7);
                break;
            case 6:
                out.println("Задание 5.1. Сущность \"Пистолет\".");
                Pistol pistol = new Pistol(3);
                for (int i = 0; i < 5; i++) { pistol.shot(); }
                break;
        }
    }
}