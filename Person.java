/*
 * Задание №1.2. Человек.
 * Создайте сущность Человек, которая описывается:
 *  Имя: строка
 *  Рост: целое число
 * Может возвращать текстовое представление вида “Name, рост: height”, где Name и height это
 * переменная с именем и ростом.
 * Необходимо создать и вывести на экран следующих людей:
 *  Человек с именем “Клеопатра” и ростом 152
 *  Человек с именем “Пушкин ” и ростом 167
 *  Человек с именем “Владимир ” и ростом 189
 */

public class Person {
    private String name;
    private int height;

    public String getName() {
        return this.name;
    }
    public int getHeight() {
        return this.height;
    }

    public String setName(String name) {
        return this.name = name;
    }
    public int setHeight(int height) {
        return this.height = height;
    }

    Person(String name, int height) {
        this.name = name;
        this.height = height;
    }
    public Person() {
        this("Unknown", 0);
    }
    public Person(String name) {
        this(name, 0);
    }
    public Person(int height) {
        this("Unknown", height);
    }

    @Override
    public String toString() {
        return String.format("%s, Height: %d", name, height);
    }
}