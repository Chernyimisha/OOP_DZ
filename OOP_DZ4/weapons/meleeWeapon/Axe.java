package OOP_DZ4.weapons.meleeWeapon;

public class Axe implements Melee{
    @Override
    public int damage() {
        return 12;
    }

    @Override
    public String toString() {
        return "Axe";
    }
}
