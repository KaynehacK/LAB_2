/*
 * Задание №1.3. Имена.
 * Создайте сущность Имя, которая описывается тремя параметрами: Фамилия, Личное имя,
 * Отчество. Имя может быть приведено к строковому виду, включающему традиционное
 * представление всех трех параметров: Фамилия Имя Отчество (например “Иванов Иван
 * Иванович”). Необходимо предусмотреть возможность того, что какой-либо из параметров может
 * быть не задан, и в этом случае он не учитывается при приведении к текстовому виду.
 * Необходимо создать следующие имена:
 *  Клеопатра
 *  Пушкин Александр Сергеевич
 *  Маяковский Владимир
 * Обратите внимание, что при выводе на экран, не заданные параметры никак не участвуют в
 * образовании строки.
 *
 * Задание №4.5. Создаем Имена.
 * Измените сущность Имя из задачи 1.3. Новые требования включают:
 *  Имя можно создать указав только Личное имя
 *  Имя можно создать указав Личное имя и Фамилию.
 *  Имя можно создать указав все три параметра: Личное имя, Фамилию, Отчество.
 * Необходимо создать следующие имена:
 * 1. Клеопатра
 * 2. Александр Сергеевич Пушкин
 * 3. Владимир Маяковский
 * 4. Христофор Бонифатьевич (здесь Христофор это имя, а Бонифатьевич - фамилия)
 */

public class Names {
    private String firstName;
    private String secondName;
    private String thirdName;

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }
    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getThirdName() {
        return thirdName;
    }
    public void setThirdName(String thirdName) {
        this.thirdName = thirdName;
    }

    public Names(String firstName, String secondName, String thirdName) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.thirdName = thirdName;
    }

    public Names(String firstName) {
        this(firstName, null, null);
    }

    public Names(String firstName, String secondName) {
        this(firstName, secondName, null);
    }

    @Override
    public String toString() {
        String string = firstName;
        if (secondName != null && !"".equals(secondName)) {
            string += " " + secondName;
        }
        if (thirdName != null && !"".equals(thirdName)) {
            string += " " + thirdName;
        }
        return string;
    }
}
