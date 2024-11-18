import static java.lang.System.out;

public class Pistol {
    int ammo;

    public int getAmmo() { return ammo; }
    public void setAmmo(int ammo) { this.ammo = ammo; }

    public Pistol(int ammo) {
        this.ammo = ammo;
        out.println("Сущность \"Пистолет\" создана. Количество патронов: " + String.valueOf(this.getAmmo()));
    }

    public Pistol() {
        this(5);
    }

    public void shot() {
        if (ammo > 0) {
            out.println("Бах!");
            ammo--;
        } else {

            out.println("Клац!");
        }
    }
}
