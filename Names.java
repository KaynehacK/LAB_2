import static java.lang.System.out;

public class Names {
    String firstName;
    String secondName;
    String thirdName;

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
        out.println("Object created. Full name: \"" + getName() + "\".");
    }

    public Names(String firstName) {
        this(firstName, null, null);
    }

    public Names(String firstName, String secondName) {
        this(firstName, secondName, null);
    }

    public String getName() {
        if (thirdName == null) {
            if (secondName == null) {
                return firstName;
            } else {
                return firstName + " " + secondName;
            }
        } else {
            return firstName + " " + secondName + " " + thirdName;
        }
    }
}
