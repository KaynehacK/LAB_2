import static java.lang.System.out;

public class Person {
    //поля
    String name;
    int height;
    //свойства
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
    //конструкторы
    Person(String name, int height) {
        this.name = name;
        this.height = height;
        out.println("Object created. Name = \"" + name + "\"; Height = " + height);
    }
    public Person() {
        this("Unknown", 0);
    }
    public Person(String name){
        this(name, 0);
    }
    public Person(int height){
        this("Unknown", height);
    }
    //методы
    public String getPerson() {
        return String.format("%s, Height: %d", name, height);
    }
}