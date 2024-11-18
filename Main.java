import static java.lang.System.out;
import java.util.Scanner;

public class Main {

    public static int InputInt() {
        return InputInt(Integer.MIN_VALUE,Integer.MAX_VALUE);
    }

    public static int InputInt(int LoLim, int HiLim) {
        Scanner in = new Scanner(System.in);
        int Res;
        while (true) {
            String input = in.nextLine();
            try {
                Res = Integer.parseInt(input);
                if ( LoLim <= Res && Res <= HiLim ) return Res;
                else {
                    out.printf("The number is out of bounds. Please try again.\n");
                    continue;
                }
            } catch (NumberFormatException e) {
                out.printf("Invalid input. Please try again.\n");
                continue;
            }
        }
    }

    public static String InputString() {
        return InputString(0,Integer.MAX_VALUE);
    }

    public static String InputString(int LoLim, int HiLim){
        Scanner in = new Scanner(System.in);
        String Res;
        while (true)
        {
            Res = in.nextLine();
            if (Res.length() >= LoLim && Res.length() <= HiLim) return Res;
            else
            {
                out.printf("Invalid count of characters. Please try again.\n");
                continue;
            }
        }
    }

    public static String EnterChar() {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine().split(" ")[0];
        while (s.isEmpty()) {
            out.println("Empty input; Try again: ");
            s = in.nextLine().split(" ")[0];
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        out.printf("Enter a code of task in accordance with a table:\n" +
                "Task code:\t| 1 | 2 | 3 | 4 | 5 | 6 |\n" +
                "Task number:|1.2|1.3|2.4|3.4|4.5|5.1|\n" +
                "Code of task: ");
        int task = in.nextInt();
        switch (task)
        {
            case 1:
            {
                out.println("Задание 1.2. Сущность \"Человек\".");
                Person p1 = new Person("Клеопатра", 152);
                Person p2 = new Person("Пушкин", 167);
                Person p3 = new Person("Владимир", 189);
                out.println(p1.getPerson());
                out.println(p2.getPerson());
                out.println(p3.getPerson());
                break;
            }
            case 2:
            {
                out.println("Задание 1.3. Сущность \"Имя\".");
                Names n1 = new Names("Клеопатра");
                Names n2 = new Names("Пушкин", "Александр", "Сергеевич");
                Names n3 = new Names("Маяковский", "Владимир");
                out.println(n1.getName());
                out.println(n2.getName());
                out.println(n3.getName());
                break;
            }
            case 3:
            {
                out.println("Задание 2.4. Сотрудники и отделы. Каждому отделу соответствует один начальнк.");
                Department d1 = new Department("IT");
                Employee e1 = new Employee("Петров", d1);
                Employee e2 = new Employee("Козлов", d1);
                Employee e3 = new Employee("Сидоров", d1);
                e2.setSuperior();
                out.println(e1.getEmployee());
                out.println(e2.getEmployee());
                out.println(e3.getEmployee());
                break;
            }
            case 4:
            {
                out.println("Задание 3.4. Сотрудники и отделы. Вывод списка всех сотрудников отдела.");
                Department d1 = new Department("IT");
                Employee e1 = new Employee("Петров", d1);
                Employee e2 = new Employee("Козлов", d1);
                Employee e3 = new Employee("Сидоров", d1);
                e2.setSuperior();
                e3.printList();
                break;
            }
            case 5:
            {
                out.println("Задание 4.5. Сущность \"Имя\", дополнение.");
                Names n1 = new Names("Клеопатра");
                Names n2 = new Names("Сергеевич", "Александр", "Пушкин");
                Names n3 = new Names("Владимир", "Маяковский");
                Names n4 = new Names("Христофор", "Бонифатьевич");
                out.println(n1.getName());
                out.println(n2.getName());
                out.println(n3.getName());
                out.println(n4.getName());
                break;
            }
            case 6:
            {
                out.println("Задание 5.1. Сущность \"Пистолет\".");
                Pistol p1 = new Pistol(3);
                for (int i = 0; i < 5; i++) { p1.shot(); }
                break;
            }
        }
    }
}