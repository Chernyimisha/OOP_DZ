package OOP_DZ4.weapons.rangedWeapon;

public class Bow implements Ranged{
    @Override
    public int damage() {
        return 20;
    }

    @Override
    public int distance() {
        return 50;
    }

    @Override
    public String toString() {
        return "Bow";
    }
}
